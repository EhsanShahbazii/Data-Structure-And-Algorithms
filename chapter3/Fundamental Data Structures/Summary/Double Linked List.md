# Summary


## Double Linked List (DLL)
#### Node class variables:
```java
private E element;                   // reference to the element stored at this node
private Node<E> prev;                // reference to the previous node in the list
private Node<E> next;                // reference to the subsequent node in the list
```
#### DLL class variables:
```java
private Node<E> header;              // header sentinel
private Node<E> trailer;             // trailer sentinel
private int size = 0;                // number of elements in the list
```
### methods:
  - **size( ):** Returns the number of elements in the list.
  - **isEmpty( ):** Returns true if the list is empty, and false otherwise.
  - **first( ):** Returns (but does not remove) the first element in the list.
  - **last( ):** Returns (but does not remove) the last element in the list.
  - **addFirst(e):** Adds a new element to the front of the list.
  - **addLast(e):** Adds a new element to the end of the list.
  - **removeFirst( ):** Removes and returns the first element of the list.
  - **removeLast( ):** Removes and returns the last element of the list.

| Operations                 | Access | Search | Insertion | Deletion |
|----------------------------|--------|--------|-----------|----------|
| Best case time complexity  | O(1)   | O(1)   | O(1)      | O(1)     |
| Worst Case time complexity | O(n)   | O(n)   | O(1)      | O(1)     |
| Average time complexity    | O(n)   | O(n)   | O(1)      | O(1)     |

### special method:
```java
/** Removes and returns the last element of the list. */
public E removeLast( ) {
  if (isEmpty( )) return null;              // nothing to remove
  return remove(trailer.getPrev( ));        // last element is before trailer
}

/** Removes the given node from the list and returns its element. */
private E remove(Node<E> node) {
  Node<E> predecessor = node.getPrev( );
  Node<E> successor = node.getNext( );
  predecessor.setNext(successor);
  successor.setPrev(predecessor);
  size−−;
  return node.getElement( );
}
```
