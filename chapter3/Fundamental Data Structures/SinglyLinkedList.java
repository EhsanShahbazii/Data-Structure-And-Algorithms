/*
Implementing a Singly Linked List Class

size( ): Returns the number of elements in the list.
isEmpty( ): Returns true if the list is empty, and false otherwise.
first( ): Returns (but does not remove) the first element in the list.
last( ): Returns (but does not remove) the last element in the list.
addFirst(e): Adds a new element to the front of the list.
addLast(e): Adds a new element to the end of the list.
removeFirst( ): Removes and returns the first element of the list.

last update: 2022 Dec 13
*/

public class SinglyLinkedList<E> {
  
  //---------------- nested Node class ----------------
  private static class Node<E> {
    private E m_element; // reference to the element stored at this node
    private Node<E> m_next; // reference to the subsequent node in the list
    
    public Node(E element, Node<E> node) {
      m_element = element;
      m_next = node;
    }
    
    public E getElement( ) { 
      return m_element;
    }
    
    public Node<E> getNext( ) { 
      return m_next;
    }
    
    public void setNext(Node<E> node) {
      m_next = node;
    }
    
  } 
  //---------------- end of nested Node class ----------------
  
  // instance variables of the SinglyLinkedList
  private Node<E> m_head; // head node of the list
  private Node<E> m_tail; // last node of the list
  private int m_size; // number of nodes in the list
  
  // constructs an initially empty list
  public SinglyLinkedList() {
    m_head = null;
    m_tail = null;
    m_size = 0;
  }
  
  // access methods
  public int size() { 
    return m_size;
  }
  
  public boolean isEmpty() { 
    return m_size == 0;
  }
  
  // returns (but does not remove) the first element
  public E first() {
    if (isEmpty()) return null;
    return m_head.getElement();
  }
  
  // returns (but does not remove) the last element
  public E last() {
    if (isEmpty()) return null;
    return m_tail.getElement();
  }
  
  // update methods adds element e to the front of the list
  public void addFirst(E element) {
    m_head = new Node<>(element, m_head); // create and link a new node
    if (m_size == 0)
      m_tail = m_head; // special case: new node becomes tail also
    m_size++;
  }
  
   // adds element e to the end of the list
  public void addLast(E element) {
    Node<E> newest = new Node<>(element, null); // node will eventually be the tail
    if (isEmpty())
      m_head = newest; // special case: previously empty list
    else
      m_tail.setNext(newest); // new node after existing tail
    m_tail = newest; // new node becomes the tail
    m_size++;
  }
  
   // removes and returns the first element
  public E removeFirst() {
    if (isEmpty()) return null; // nothing to remove
    E answer = m_head.getElement();
    m_head = m_head.getNext(); // will become null if list had only one node
    m_size−−;
    if (m_size == 0)
      m_tail = null; // special case as list is now empty
    return answer;
  }
  
}
