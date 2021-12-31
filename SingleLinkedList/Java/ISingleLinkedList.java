public interface ISingleLinkedList<Type> {

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

// uptade 27 November
