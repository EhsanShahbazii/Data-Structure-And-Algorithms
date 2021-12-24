package com.tabrizu.ds;


public interface IDoubleLinkedList<T> {
    public int size();
    public void addFirst(T value);
    public void addLast(T value);
    public T removeFirst();
    public T removeLast();
    public T getFirst();
    public T getLast();
    public boolean equals(IDoubleLinkedList<T> other);

    public static <T extends Comparable> IDoubleLinkedList<T> create(){
        return new DoubleLinkedList<T>();
    }
}
