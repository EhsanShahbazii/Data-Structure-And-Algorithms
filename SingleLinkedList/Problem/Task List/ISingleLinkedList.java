package com.tabrizu.ds;


public interface ISingleLinkedList<T> {
    public int size();
    public void addFirst(T value);
    public void addLast(T value);
    public T removeFirst();
    public T getFirst();
    public T getLast();

    public static <T> ISingleLinkedList<T> create(){
        return new SingleLinkedList<T>();
    }
}
