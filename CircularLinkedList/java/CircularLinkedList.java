public class CircularLinkedList<Type> implements ICircularLinkedList<Type> {

    private Node<Type> m_head;
    private Node<Type> m_tail;
    private int m_size;

    public CircularLinkedList() {
        m_head = null;
        m_tail = null;
        m_size = 0;
    }

    @Override
    public void insertFirst(Type value) {

        m_head = new Node<Type>(value, m_head);

        m_tail = (m_size == 0) ? m_head : m_tail;

        m_size++;
    }

    @Override
    public void insertLast(Type value) {

        m_tail = new Node<Type>(value, m_head);

        m_head = (m_size == 0) ? m_tail : m_head;

        m_size++;
    }

    @Override
    public boolean isEmpty() {
        return m_size == 0;
    }

    @Override
    public int size() {
        return m_size;
    }

    @Override
    public Node<Type> first() {
        return m_head;
    }

    @Override
    public Node<Type> last() {
        return m_tail;
    }

    @Override
    public Type deleteFirst() {

        if (m_size == 0)
            return null;

        Type lastHead = m_head.getValue();
        m_head = m_head.getNext();
        m_size--;

        return lastHead;
    }
}
