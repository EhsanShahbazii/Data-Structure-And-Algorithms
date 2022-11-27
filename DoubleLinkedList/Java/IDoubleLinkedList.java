public interface IDoubleLinkedList<Type> {

    void addFirst(Type value);
    void addLast(Type value);

    Type removeFirst();
    Type removeLast();

    int size();

    boolean isEmpty();

    void showList();

    Node<Type> getHead();
    Node<Type> getTail();
}

// update 27 November
