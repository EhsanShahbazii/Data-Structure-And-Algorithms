/*
Implementing a Stack with a Singly Linked List

last update 2022 Dec 14
*/
public class LinkedStack<E> implements Stack<E> {
  
  private SinglyLinkedList<E> list = new SinglyLinkedList<>( ); // an empty list
  
  // new stack relies on the initially empty list
  public LinkedStack( ) {
  } 
  
  public int size( ) {
    return list.size( );
  }
  
  public boolean isEmpty( ) { 
    return list.isEmpty( );
  }
  
  public void push(E element) {
    list.addFirst(element);
  }
  
  public E top( ) { 
    return list.first( );
  }
  
  public E pop( ) {
    return list.removeFirst( );
  }
  
}
