# Summary


## Queue(FIFO) array-base
#### ArrayQueue class variables:
```java
private E[ ] data;                            // generic array used for storage
private int f = 0;                            // index of the front element
private int sz = 0;                           // current number of elements
```
### methods:
  - **enqueue(e):** Adds element e to the back of queue.
  - **dequeue( ):** Removes and returns the first element from the queue
                    (or null if the queue is empty).
                    The queue ADT also includes the following accessor methods (with first being
                    analogous to the stack’s top method):
  - **first( ):** Returns the first element of the queue, without removing it
                  (or null if the queue is empty).
  - **size( ):** Returns the number of elements in the queue.
  - **isEmpty( ):** Returns a boolean indicating whether the queue is empty.

| Operations                 | Access | Search | Insertion | Deletion |
|----------------------------|--------|--------|-----------|----------|
| Best case time complexity  | O(1)   | O(1)   | O(1)      | O(1)     |
| Worst Case time complexity | O(n)   | O(n)   | O(1)      | O(1)     |
| Average time complexity    | O(n)   | O(n)   | O(1)      | O(1)     |

| function                   | Order  |
|----------------------------|--------|
| enqueue(e)                 | O(1)   |
| dequeue( )                 | O(1)   |
| first( )                   | O(1)   |
| size( )                    | O(1)   |
| isEmpty( )                 | O(1)   |

### special method:
```java
/* Array Queue */

/** Inserts an element at the rear of the queue. */
public void enqueue(E e) throws IllegalStateException {
  if (sz == data.length) throw new IllegalStateException("Queue is full");
  int avail = (f + sz) % data.length;                         // use modular arithmetic
  data[avail] = e;
  sz++;
}

/** Removes and returns the first element of the queue (null if empty). */
public E dequeue( ) {
  if (isEmpty( )) return null;
  E answer = data[f];
  data[f] = null;                                             // dereference to help garbage collection
  f = (f + 1) % data.length;
  sz−−;
  return answer;
}

/* Linked Queue */
public void enqueue(E element) { 
  list.addLast(element);
}

public E dequeue( ) { 
  return list.removeFirst( );
}
```
