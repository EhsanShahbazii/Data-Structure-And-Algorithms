package com.tabrizu.ds;

public class DoubleLinkedList<T extends Comparable> implements IDoubleLinkedList<T> , ICloneable {

    private class Node{
        private T m_value;
        private Node m_prev;
        private Node m_next;

        public Node(T value, Node prev, Node next){
            m_value = value;
            m_prev = prev;
            m_next = next;
        }

        public T getValue(){
            return m_value;
        }
        public Node getNext(){
            return m_next;
        }
        public Node getPrev(){
            return m_prev;
        }

        public void updateValue(T value){
            m_value = value;
        }

        public void setNext(Node next){
            m_next = next;
        }
        public void setPrev(Node prev){
            m_prev = prev;
        }
    }

    private Node m_head;
    private Node m_tail;
    private int m_size;

    public DoubleLinkedList(){
        m_head = null;
        m_tail = null;
        m_size = 0;
    }

    @Override
    public int size() {
        return m_size;
    }

    @Override
    public void addFirst(T value) {
        Node newNode = new Node(value, null, m_head);

        if(m_head != null){
            m_head.setPrev(newNode);
        }
        m_head = newNode;
        if(m_size == 0){
            m_tail = m_head;
        }
        m_size ++;
    }

    @Override
    public void addLast(T value) {
        Node newNode = new Node(value, m_tail, null);

        if(m_tail != null){
            m_tail.setNext(newNode);
        }
        m_tail = newNode;
        if(m_size == 0){
            m_head = m_tail;
        }
        m_size ++;
    }

    @Override
    public T removeFirst() {
        if(m_size == 0){
            return null;
        }
        T headValue = m_head.getValue();
        m_head = m_head.getNext();

        if(m_head != null){
            m_head.setPrev(null);
        }
        else{
            m_tail = null;
        }
        m_size -- ;
        return headValue;
    }

    @Override
    public T removeLast() {
        if(m_size == 0){
            return null;
        }
        T tailValue = m_tail.getValue();
        m_tail = m_tail.getPrev();

        if(m_tail != null){
            m_tail.setNext(null);
        }
        else{
            m_head = null;
        }
        m_size -- ;
        return tailValue;
    }

    @Override
    public T getFirst() {
        if(m_head != null){
            return m_head.getValue();
        }
        return null;
    }

    @Override
    public T getLast() {
        if(m_tail != null){
            return m_tail.getValue();
        }
        return null;
    }

    @Override
    public String toString(){
        String str =  "[\n";
        Node pointer = m_head;
        while(pointer != null){
            str += "\t" + pointer.getValue() + " ,\n";
            pointer = pointer.getNext();
        }
        str += "]";
        return str;
    }

    @Override
    public boolean equals(IDoubleLinkedList<T> other) {
        if(! (other instanceof DoubleLinkedList)){
            return false;
        }
        DoubleLinkedList<T> _other = (DoubleLinkedList<T>)other;
        if(other == null)
        {
            return false;
        }
        if(this.size() != other.size()){
            return false;
        }
        Node p_this = m_head;
        Node p_other = _other.m_head;
        while(p_this != null){
            if(! p_other.getValue().equals(p_this.getValue())){
                return false;
            }
            p_this = p_this.getNext();
            p_other = p_other.getNext();
        }
        return true;
    }


    @Override
    public ICloneable clone() throws CloneNotSupportedException{
        if(m_head == null){
            return new DoubleLinkedList<T>();
        }
        if(! (m_head.getValue() instanceof ICloneable)){
            throw new CloneNotSupportedException("Not supported");
        }
        DoubleLinkedList<T> cloned = new DoubleLinkedList<>();
        Node p_this = m_head;
        while(p_this != null){
            ICloneable _v = (ICloneable)p_this.getValue();
            T __v = (T)_v.clone();
            cloned.addLast(__v);
            p_this = p_this.getNext();
        }
        return cloned;

    }

    private void swap(Node node1, Node node2){
        T tmp = node1.getValue();
        node1.updateValue(node2.getValue());
        node2.updateValue(tmp);
    }

    private void swap(Node node, boolean swapNext){
        T tmp = swapNext ? node.getNext().getValue() : node.getPrev().getValue();
        (swapNext ? node.getNext() : node.getPrev()).updateValue(node.getValue());
        node.updateValue(tmp);
    }

    public void sort() {

        Node p_i = m_head;

        while (p_i != null) {
            Node p_c = p_i;
            Node p_j = p_i.getNext();

            while (p_j != null) {
                if (p_j.getValue().compareTo(p_c.getValue()) < 0) {
                    p_c = p_j;
                }
                p_j = p_j.getNext();
            }

            if (p_c != p_i) {
                swap(p_c, p_i);
            }

            p_i = p_i.getNext();
        }

    }
}
