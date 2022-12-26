public interface CircularQueue<E> extends IQueue<E> {
  /**
  * Rotates the front element of the queue to the back of the queue.
  * This does nothing if the queue is empty.
  */
  
  void rotate( );
}
