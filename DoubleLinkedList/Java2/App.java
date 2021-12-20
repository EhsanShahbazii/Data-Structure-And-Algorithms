package com.tabrizu.ds;

public final class App {

    public App() {

    }
    public static void main(String[] args) {

        IDoubleLinkedList<Long> randList = IDoubleLinkedList.create();

        for (int i = 0; i < 20; i++) {
            randList.addFirst(Math.round(Math.random() * 100));
        }

        for (int i = 0; i < 10; i++) {

            if(Math.random() < 0.2){
                randList.removeFirst();
            }

            if(Math.random() < 0.2){
                randList.removeLast();
            }
        }

        System.out.println(randList);

    }
}
