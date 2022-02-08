/*
Implementing a clone method

last update: 2022 Dec 13
*/

public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
  // always use inherited Object.clone() to create the initial copy
  SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); // safe cast
  
  if (size > 0) { // we need independent chain of nodes
    other.head = new Node<>(head.getElement(), null);
    Node<E> walk = head.getNext(); // walk through remainder of original list
    Node<E> otherTail = other.head; // remember most recently created node
    
    while (walk != null) { // make a new node storing same element
      Node<E> newest = new Node<>(walk.getElement(), null);
      otherTail.setNext(newest); // link previous node to this one
      otherTail = newest;
      walk = walk.getNext();
    }
  }
  return other;
}
