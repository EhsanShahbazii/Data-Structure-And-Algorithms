/** Implementation of the queue ADT using a fixed-length array. */
public class ArrayQueue<E> implements Queue<E> {
  // instance variables
  private E[ ] m_data; // generic array used for storage
  private int frontIndex = 0; // index of the front element
  private int currentIndex = 0; // current number of elements
  
  // constructors
  // constructs queue with default capacity
  public ArrayQueue( ) {
    this(CAPACITY);
  } 
  
  // constructs queue with given capacity
  public ArrayQueue(int capacity) { 
    m_data = (E[ ]) new Object[capacity]; // safe cast; compiler may give warning
  }
  
  // methods
  // Returns the number of elements in the queue.
  public int size( ) { 
    return currentIndex;
  }
  
  // Tests whether the queue is empty.
  public boolean isEmpty( ) { 
    return (currentIndex == 0);
  }
  
  // Inserts an element at the rear of the queue.
  public void enqueue(E e) throws IllegalStateException {
    if (currentIndex == m_data.length) throw new IllegalStateException("Queue is full");
    int avail = (frontIndex + currentIndex) % m_data.length; // use modular arithmetic
    m_data[avail] = e;
    currentIndex++;
  }
  
  // Returns, but does not remove, the first element of the queue (null if empty).
  public E first( ) {
    if (isEmpty( )) return null;
    return m_data[frontIndex];
  }
  
  // Removes and returns the first element of the queue (null if empty).
  public E dequeue( ) {
    if (isEmpty( )) return null;
    E answer = m_data[frontIndex];
    m_data[frontIndex] = null; // dereference to help garbage collection
    frontIndex = (frontIndex + 1) % m_data.length;
    currentIndex−−;
    return answer;
  }
