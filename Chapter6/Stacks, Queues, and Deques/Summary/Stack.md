# Summary


## Stack(LIFO) array-base
#### ArrayStack class variables:
```java
public static final int CAPACITY=1000;              // default array capacity
private E[ ] data;                                  // generic array used for storage
private int t = −1;                                 // index of the top element in stack
```
### methods:
  - **push(e):** Adds element e to the top of the stack.
  - **pop( ):** Removes and returns the top element from the stack
                (or null if the stack is empty).
                Additionally, a stack supports the following accessor methods for convenience:
  - **top( ):** Returns the top element of the stack, without removing it
                (or null if the stack is empty).
  - **size( ):** Returns the number of elements in the stack.
  - **isEmpty( ):** Returns a boolean indicating whether the stack is empty.

| Operations                 | Access | Search | Insertion | Deletion |
|----------------------------|--------|--------|-----------|----------|
| Best case time complexity  | O(1)   | O(1)   | O(1)      | O(1)     |
| Worst Case time complexity | O(n)   | O(n)   | O(1)      | O(1)     |
| Average time complexity    | O(n)   | O(n)   | O(1)      | O(1)     |

| function                   | Order  |
|----------------------------|--------|
| push(e)                    | O(1)   |
| pop( )                     | O(1)   |
| top( )                     | O(1)   |
| size( )                    | O(1)   |
| isEmpty( )                 | O(1)   |

### special method:
```java
public class LinkedStack<E> implements Stack<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>( );     // an empty list
  public LinkedStack( ) { }                                         // new stack relies on the initially empty list
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
```
