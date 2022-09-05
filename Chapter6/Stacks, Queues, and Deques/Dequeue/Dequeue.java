import java.io.*;

class GFG {
  static final int capacity = 10;
  static class Queue {
    int queue[] = new int[capacity];
    int front;
    int rear;
    
    void Queue() {
      front = -1;
      rear = -1;
    }

    void enqueue(int val)
    {
      if (front == -1) {
        front++;
      }

      if (rear == capacity - 1) {
        System.out.println("Queue overflow!!!");
        return;
      }

      queue[++rear] = val;
    }
    void dequeue()
    {
      if (front == -1 || front > rear) {
        System.out.println("Queue is empty!!!");
      }
      System.out.println("Element deleted from queue : "+ queue[front + 1]);
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    // Inserting elements in the queue
    // using enqueue operation
    q.enqueue(1);
    q.enqueue(2);

    // Deleting elements from the queue
    // using dequeue operation
    q.dequeue();
  }
}
