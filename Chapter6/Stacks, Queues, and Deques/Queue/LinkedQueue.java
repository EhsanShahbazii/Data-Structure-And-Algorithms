/*
Implementing a Queue with a Singly Linked List

enqueue(e):       Adds element e to the back of queue.
dequeue( ):       Removes and returns the first element from the queue (or null if the queue is empty).
                  The queue ADT also includes the following accessor methods (with first being analogous to the stack’s top method):
first( ):         Returns the first element of the queue, without removing it (or null if the queue is empty).
size( ):          Returns the number of elements in the queue.
isEmpty( ):       Returns a boolean indicating whether the queue is empty.

last update 2022 Dec 26
*/

/** Realization of a FIFO queue as an adaptation of a SinglyLinkedList. */
public class LinkedQueue<E> implements Queue<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>( ); // an empty list
  
  public LinkedQueue( ) { } // new queue relies on the initially empty list
  
  public int size( ) {
    return list.size( );
  }
  
  public boolean isEmpty( ) {
    return list.isEmpty( );
  }
  
  public void enqueue(E element) {
    list.addLast(element);
  }
  
  public E first( ) {
    return list.first( );
  }
  
  public E dequeue( ) {
    return list.removeFirst( );
  }
}
