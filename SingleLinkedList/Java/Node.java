public class Node<Type> {

    private Type m_value;
    private Node<Type> m_next;

    public Node() {
        m_value = null;
        m_next = null;
    }

    public Node(Type value, Node<Type> next) {
        m_value = value;
        m_next = next;
    }

    public Type getValue() {
        return m_value;
    }

    public Node<Type> getNext() {
        return m_next;
    }

    public void setValue(Type value) {
        m_value = value;
    }

    public void setNext(Node<Type> next) {
        m_next = next;
    }
}

// update 27 November
