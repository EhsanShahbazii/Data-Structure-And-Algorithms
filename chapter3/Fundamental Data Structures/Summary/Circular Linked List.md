# Summary


## Circular Linked List (CLL)
#### Node class variables:
```java
private E element;                  // reference to the element stored at this node
private Node<E> next;               // reference to the subsequent node in the list
```
#### C  LL class variables:
```java
private Node<E> tail = null;        // we store tail (but not head)
private int size = 0;               // number of nodes in the list
```
### methods:
  - **size( ):** Returns the number of elements in the list.
  - **isEmpty( ):** Returns true if the list is empty, and false otherwise.
  - **first( ):** Returns (but does not remove) the first element in the list.
  - **last( ):** Returns (but does not remove) the last element in the list.
  - **addFirst(e):** Adds a new element to the front of the list.
  - **addLast(e):** Adds a new element to the end of the list.
  - **removeFirst( ):** Removes and returns the first element of the list.
  - **rotate( ):** Moves the first element to the end of the list.

| Operations                 | Access | Search | Insertion | Deletion |
|----------------------------|--------|--------|-----------|----------|
| Best case time complexity  | O(1)   | O(1)   | O(1)      | O(1)     |
| Worst Case time complexity | O(n)   | O(n)   | O(n)      | O(n)     |
| Average time complexity    | O(n)   | O(n)   | O(1)      | O(1)     |

### special method:
```java
public void rotate( ) {            // rotate the first element to the back of the list
  if (tail != null)                // if empty, do nothing
    tail = tail.getNext( );        // the old head becomes the new tail
}
```
