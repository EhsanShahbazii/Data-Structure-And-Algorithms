package com.tabrizu.ds;

public class SingleLinkedList<T> implements ISingleLinkedList<T> {

    private class Node{
        private T m_value;
        private Node m_next;

        public Node(T value, Node next){
            m_value = value;
            m_next = next;
        }

        public T getValue(){
            return m_value;
        }
        public Node getNext(){
            return m_next;
        }

        public void setNext(Node next){
            m_next = next;
        }
    }

    private Node m_head;
    private Node m_tail;
    private int m_size;

    public SingleLinkedList(){
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

        m_head = new Node(value, m_head);

        if(m_size == 0) m_tail = m_head;
        m_size++;
    }

    @Override
    public void addLast(T value) {

        m_tail = new Node(value, null);

        if(m_size == 0) m_head = m_tail;
        m_size++;
    }

    @Override
    public T removeFirst() {

        if(m_size == 0) return null;

        T lastHead = m_head.getValue();
        m_head = m_head.getNext();
        m_size--;

        return lastHead;
    }

    @Override
    public T getFirst() {
        return m_head.getValue();
    }

    @Override
    public T getLast() {
        return m_tail.getValue();
    }

    @Override
    public String toString() {

        String result = "";
//        ISingleLinkedList<Task> copyList = ISingleLinkedList.create();

        for (int i = 0; i < m_size; i++) {
            result = result.concat(m_head.getValue().toString() + "\n");
//            copyList.addFirst((Task) m_head.getValue());
            m_head = m_head.getNext();
        }


        return result;
    }

}
