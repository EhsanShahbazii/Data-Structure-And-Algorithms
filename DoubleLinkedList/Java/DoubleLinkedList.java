public class DoubleLinkedList<Type> implements IDoubleLinkedList<Type> {

    private Node<Type> m_head;
    private Node<Type> m_tail;
    private int m_size;

    public DoubleLinkedList() {
        m_head = null;
        m_tail = null;
        m_size = 0;
    }

    @Override
    public void insertFirst(Type value) {

        m_head = new Node<Type>(value, null, m_head);

        m_tail = (m_size == 0) ? m_head : m_tail;

        m_size++;
    }

    @Override
    public void insertLast(Type value) {

        m_tail = new Node<Type>(value, m_tail, null);

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
        m_head.setPrev(null);
        m_size--;

        return lastHead;
    }

    @Override
    public Type deleteLast() {

        if (m_size == 0)
            return null;

        Type lastTail = m_tail.getValue();
        m_tail = m_tail.getPrev();
        m_head.setNext(null);
        m_size--;

        return lastTail;
    }

    @Override
    public void showList() {

        System.out.println(m_head.getValue());

        for (int i = 1; i < m_size; i++) {
            System.out.println(m_head.getNext().getValue());
            m_head = m_head.getNext();
        }
    }
}
