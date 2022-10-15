public interface IDoubleLinkedList<Type> {

    void insertFirst(Type value);
    void insertLast(Type value);
    void showList();

    boolean isEmpty();

    int size();
    
    Node<Type> first();
    Node<Type> last();
    Type deleteFirst();
    Type deleteLast();
}
