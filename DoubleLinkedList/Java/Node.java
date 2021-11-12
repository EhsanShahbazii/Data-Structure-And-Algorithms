public class Node<Type> {

    private Type m_value;
    private Node<Type> m_next;
    private Node<Type> m_prev;

    public Node() {
        m_value = null;
        m_next = null;
        m_prev = null;
    }

    public Node(Type value, Node<Type> prev, Node<Type> next) {
        m_value = value;
        m_prev = prev;
        m_next = next;
    }

    public Type getValue() {
        return m_value;
    }

    public Node<Type> getNext() {
        return m_next;
    }

    public Node<Type> getPrev() {
        return m_prev;
    }

    public void setValue(Type value) {
        m_value = value;
    }

    public void setNext(Node<Type> next) {
        m_next = next;
    }

    public void setPrev(Node<Type> prev) {
        m_prev = prev;
    }
}
