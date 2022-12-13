/*
Implementing a Circularly Linked List Class

size( ): Returns the number of elements in the list.
isEmpty( ): Returns true if the list is empty, and false otherwise.
first( ): Returns (but does not remove) the first element in the list.
last( ): Returns (but does not remove) the last element in the list.
addFirst(e): Adds a new element to the front of the list.
addLast(e): Adds a new element to the end of the list.
removeFirst( ): Removes and returns the first element of the list.
rotate( ): rotate the elements in the the list

last update: 2022 Dec 13
*/


public class CircularlyLinkedList<E> {
  
  //---------------- nested Node class ----------------
  private static class Node<E> {
    private E m_element; // reference to the element stored at this node
    private Node<E> m_next; // reference to the subsequent node in the list
    
    public Node(E element, Node<E> node) {
      m_element = element;
      m_next = node;
    }
    
    public E getElement() { 
      return m_element;
    }
    
    public Node<E> getNext() { 
      return m_next;
    }
    
    public void setNext(Node<E> node) {
      m_next = node;
    }
    
  } 
  //---------------- end of nested Node class ----------------
  
  // instance variables of the CircularlyLinkedList
  private Node<E> m_tail; // we store tail (but not head)
  private int m_size; // number of nodes in the list
  
  // constructs an initially empty list
  public CircularlyLinkedList() { 
    m_tail = null;
    m_size = 0;
  }
  
  // access methods
  public int size() { 
    return size;
  }
  
  public boolean isEmpty( ) {
    return size == 0;
  }
  
  // returns (but does not remove) the first element
  public E first() {
    if (isEmpty()) return null;
    return m_tail.getNext().getElement(); // the head is *after* the tail
  }
  
  // returns (but does not remove) the last element
  public E last() {
    if (isEmpty()) return null;
    return m_tail.getElement();
  }
  
  // update methods rotate the first element to the back of the list
  public void rotate() {
    if (m_tail != null) // if empty, do nothing
      m_tail = m_tail.getNext(); // the old head becomes the new tail
  }
  
  // adds element e to the front of the list
  public void addFirst(E element) {
    if (size == 0) {
      m_tail = new Node<>(element, null);
      m_tail.setNext(m_tail); // link to itself circularly
    } else {
      Node<E> newest = new Node<>(element, m_tail.getNext());
      m_tail.setNext(newest);
    }
    size++;
  }
  
  // adds element e to the end of the list
  public void addLast(E element) {
    addFirst(element); // insert new element at front of list
    m_tail = m_tail.getNext(); // now new element becomes the tail
  }
  
  // removes and returns the first element
  public E removeFirst() {
    if (isEmpty()) return null; // nothing to remove
    Node<E> head = m_tail.getNext();
    if (head == m_tail) m_tail = null; // must be the only node left
    else m_tail.setNext(head.getNext()); // removes ”head” from the list
    size−−;
    return head.getElement();
  }
  
}
