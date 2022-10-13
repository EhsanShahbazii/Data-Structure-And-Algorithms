public interface ISingleLinkedList<Type> {

    void insertFirst(Type value);
    void insertLast(Type value);

    boolean isEmpty();

    int size();
    
    Node<Type> first();
    Node<Type> last();
    Type deleteFirst();
}
