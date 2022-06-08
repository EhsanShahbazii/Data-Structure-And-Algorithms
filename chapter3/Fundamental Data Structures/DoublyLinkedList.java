/*
Implementing a Doubly Linked List Class

size( ): Returns the number of elements in the list.
isEmpty( ): Returns true if the list is empty, and false otherwise.
first( ): Returns (but does not remove) the first element in the list.
last( ): Returns (but does not remove) the last element in the list.
addFirst(e): Adds a new element to the front of the list.
addLast(e): Adds a new element to the end of the list.
removeFirst( ): Removes and returns the first element of the list.
removeLast( ): Removes and returns the last element of the list.
addBetween( ): Adds element e to the linked list in between the given nodes.
remove( ): Removes the given node from the list and returns its element.

last update: 2022 Dec 13
*/

// A basic doubly linked list implementation.
public class DoublyLinkedList<E> {
  
  //---------------- nested Node class ----------------
  private static class Node<E> {
    private E m_element; // reference to the element stored at this node
    private Node<E> m_prev; // reference to the previous node in the list
    private Node<E> m_next; // reference to the subsequent node in the list
    
    public Node(E element, Node<E> prev, Node<E> next) {
      m_element = element;
      m_prev = prev;
      m_next = next;
    }
    
    public E getElement( ) { 
      return m_element;
    }
    
    public Node<E> getPrev( ) {
      return m_prev;
    }
    
    public Node<E> getNext( ) {
      return m_next;
    }
    
    public void setPrev(Node<E> prev) {
      m_prev = prev;
    }
    
    public void setNext(Node<E> next) {
      m_next = next;
    }
   
  }
  //----------- end of nested Node class -----------
  
  // instance variables of the DoublyLinkedList
  private Node<E> m_header; // header sentinel
  private Node<E> m_trailer; // trailer sentinel
  private int m_size; // number of elements in the list
  
  // Constructs a new empty list.
  public DoublyLinkedList() {
    m_header = new Node<>(null, null, null); // create header
    m_trailer = new Node<>(null, m_header, null); // trailer is preceded by header
    m_header.setNext(m_trailer); // header is followed by trailer
    m_size = 0;
  }
  
  // Returns the number of elements in the linked list.
  public int size() {
    return m_size;
  }
  
  // Tests whether the linked list is empty.
  public boolean isEmpty() {
    return m_size == 0;
  }
  
  // Returns (but does not remove) the first element of the list.
  public E first() {
    if (isEmpty()) return null;
    return m_header.getNext().getElement(); // first element is beyond header
  }
  
  // Returns (but does not remove) the last element of the list.
  public E last() {
    if (isEmpty()) return null;
    return m_trailer.getPrev().getElement(); // last element is before trailer
  }
  
  // public update methods
  // Adds element e to the front of the list.
  public void addFirst(E element) {
    addBetween(element, m_header, m_header.getNext()); // place just after the header
  }
  
  // Adds element e to the end of the list.
  public void addLast(E element) {
    addBetween(element, m_trailer.getPrev(), m_trailer); // place just before the trailer
  }
  
  // Removes and returns the first element of the list.
  public E removeFirst() {
    if (isEmpty()) return null; // nothing to remove
    return remove(m_header.getNext()); // first element is beyond header
  }
  
  // Removes and returns the last element of the list.
  public E removeLast() {
    if (isEmpty()) return null; // nothing to remove
    return remove(m_trailer.getPrev()); // last element is before trailer
  }
  
  // private update methods
  // Adds element e to the linked list in between the given nodes. 
  private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
    // create and link a new node
    Node<E> newest = new Node<>(element, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrev(newest);
    m_size++;
  }
  
  // Removes the given node from the list and returns its element.
  private E remove(Node<E> node) {
    Node<E> predecessor = node.getPrev();
    Node<E> successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    m_size−−;
    return node.getElement();
  }
  
}
