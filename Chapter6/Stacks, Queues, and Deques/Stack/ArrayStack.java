/*
Implementing a Stack Class

push(e): Adds element e to the top of the stack.
pop( ): Removes and returns the top element from the stack (or null if the stack is empty). Additionally, a stack supports the following accessor methods for convenience:
top( ): Returns the top element of the stack, without removing it (or null if the stack is empty).
size( ): Returns the number of elements in the stack.
isEmpty( ): Returns a boolean indicating whether the stack is empty.

last update 2022 Dec 14
*/

public class ArrayStack<E> implements IStack<E> {
  
  public static final int CAPACITY = 1000; // default array capacity
  private E[] data; // generic array used for storage
  private int m_index = −1; // index of the top element in stack
  
  // constructs stack with default capacity
  public ArrayStack() { 
    this(CAPACITY);
  } 
  
  // constructs stack with given capacity
  public ArrayStack(int capacity) {
    data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
  }
  
  public int size() { 
    return (m_index + 1);
  }
  
  public boolean isEmpty() {
    return (m_index == −1);
  }
  
  public void push(E element) throws IllegalStateException {
    if (size() == data.length) throw new IllegalStateException("Stack is full");
    data[++m_index] = element; // increment t before storing new item
  }
  
  public E top() {
    if (isEmpty()) return null;
    return data[m_index];
  }
  
  public E pop() {
    if (isEmpty()) return null;
    E answer = data[m_index];
    data[m_index] = null; // dereference to help garbage collection
    m_index−−;
    return answer;
  }
  
}
