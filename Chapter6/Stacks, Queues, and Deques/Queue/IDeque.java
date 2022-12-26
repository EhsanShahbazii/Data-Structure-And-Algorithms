/**
* Interface for a double-ended queue: a collection of elements that can be inserted
* and removed at both ends; this interface is a simplified version of java.util.Deque.

addFirst(e):        Insert a new element e at the front of the deque.
addLast(e):         Insert a new element e at the back of the deque.
removeFirst( ):     Remove and return the first element of the deque (or null if the deque is empty).
removeLast( ):      Remove and return the last element of the deque (or null if the deque is empty).
                    Additionally, the deque ADT will include the following accessors:
first( ):           Returns the first element of the deque, without removing it (or null if the deque is empty).
last( ):            Returns the last element of the deque, without removing it (or null if the deque is empty).
size( ):            Returns the number of elements in the deque.
isEmpty( ):         Returns a boolean indicating whether the deque is empty.

last update 2022 Dec 26
*/

public interface Deque<E> {
  
  // Returns the number of elements in the deque.
  int size( );
  
  // Tests whether the deque is empty.
  boolean isEmpty( );
  
  // Returns, but does not remove, the first element of the deque (null if empty).
  E first( );
  
  // Returns, but does not remove, the last element of the deque (null if empty).
  E last( );
  
  // Inserts an element at the front of the deque.
  void addFirst(E e);
  
  // Inserts an element at the back of the deque.
  void addLast(E e);
  
  // Removes and returns the first element of the deque (null if empty).
  E removeFirst( );
  
  // Removes and returns the last element of the deque (null if empty).
  E removeLast( );
}
