/*
The Josephus Problem

In the children’s game “hot potato,” a group of n children sit in a circle passing
an object, called the “potato,” around the circle. The potato begins with a starting
child in the circle, and the children continue passing the potato until a leader rings a
bell, at which point the child holding the potato must leave the game after handing
the potato to the next child in the circle. After the selected child leaves, the other
children close up the circle. This process is then continued until there is only one
child remaining, who is declared the winner. If the leader always uses the strategy
of ringing the bell so that every k th person is removed from the circle, for some
fixed value k, then determining the winner for a given list of children is known as the
Josephus problem (named after an ancient story with far more severe consequences
than in the children’s game).

last update 2022 Dec 26
*/

public class Josephus {
  /** Computes the winner of the Josephus problem using a circular queue. */
  public static <E> E Josephus(CircularQueue<E> queue, int k) {
    
    if (queue.isEmpty( )) return null;
    
    while (queue.size( ) > 1) {
      for (int i=0; i < k−1; i++) // skip past k-1 elements
        queue.rotate( );
      
      E e = queue.dequeue( ); // remove the front element from the collection
      System.out.println(" " + e + " is out");
    }
    return queue.dequeue( ); // the winner
  }
  
  /** Builds a circular queue from an array of objects. */
  public static <E> CircularQueue<E> buildQueue(E a[ ]) {
    CircularQueue<E> queue = new LinkedCircularQueue<>( );
    
    for (int i=0; i<a.length; i++)
      queue.enqueue(a[i]);
    return queue;
  }
  
  /** Tester method */
  public static void main(String[ ] args) {
    
    String[ ] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
    String[ ] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
    String[ ] a3 = {"Mike", "Roberto"};
    
    System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
    System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
    System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
  }
}
