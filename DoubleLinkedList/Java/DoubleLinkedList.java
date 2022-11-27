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
    public void addFirst(Type value) {
        m_head = new Node<>(value, null, m_head);
        m_tail = m_size == 0 ? m_head : m_tail;
        m_size++;
    }

    @Override
    public void addLast(Type value) {
        m_tail = new Node<>(value, m_tail, null);
        m_head = m_size == 0 ? m_tail : m_head;
        m_size++;
    }

    @Override
    public Type removeFirst() {
        Type prevHead = m_head.getValue();
        m_head = m_head.getNext();
        m_head.setPrev(null);
        m_size--;

        return prevHead;
    }

    @Override
    public Type removeLast() {
        Type prevTail = m_tail.getValue();
        m_tail = m_tail.getPrev();
        m_tail.setNext(null);
        m_size--;

        return prevTail;
    }

    @Override
    public int size() {
        return m_size;
    }

    @Override
    public boolean isEmpty() {
        return m_size == 0;
    }

    @Override
    public void showList() {
        Node<Type> pointer = m_head;

        for (int i = 0; i < m_size; i++) {
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }

    @Override
    public Node<Type> getHead() {
        return m_head;
    }

    @Override
    public Node<Type> getTail() {
        return m_tail;
    }
}

// update 27 November
