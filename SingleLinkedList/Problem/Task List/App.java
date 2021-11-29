package com.tabrizu.ds;

import java.util.Scanner;

public class App {

    ISingleLinkedList<Task> m_unfinished;
    ISingleLinkedList<Task> m_finished;
    static Scanner scanner = new Scanner(System.in);

    public App() {
        m_unfinished = ISingleLinkedList.create();
        m_finished = ISingleLinkedList.create();
    }
    public static void main(String[] args) {

        App O_o = new App(); // :)
        while (true) {
            System.out.println("choose one(just enter number): ");
            System.out.println("1. Add new task");
            System.out.println("2. Current task done");
            System.out.println("3. See current task");
            System.out.println("4. See finished task");
            System.out.println("5. See unfinished task");
            System.out.println("6. exit app");
            String O_O = scanner.nextLine();

            switch (O_O) {
                case "1":
                    O_o.handleNewTask();
                    break;
                case "2":
                    O_o.taskDone();
                    break;
                case "3":
                    O_o.handleCurrentTask();
                    break;
                case "4":
                    O_o.handleShowFinishedTask();
                    break;
                case "5":
                    O_o.handleShowUnFinishedTask();
                case "6":
                    System.exit(0);
            }
        }
    }

    public void handleShowFinishedTask() {
        System.out.println("***** finished tasks *****");
        System.out.println(showFinishedTask());
    }

    public void handleShowUnFinishedTask() {
        System.out.println("***** unfinished tasks *****");
        System.out.println(showUnFinishedTask());
    }

    public void handleCurrentTask() {
        System.out.println("***** Current tasks *****");
        System.out.println(getCurrentTask().getTitle() + "\n");
    }

    public void handleNewTask() {

        System.out.println("Enter your task: ");
        String O_o = scanner.nextLine();
        Task o_o = new Task(O_o);

        System.out.println("is this task normal?(Y or N)");
        String O_O = scanner.nextLine();

        addTask(o_o, O_O.equals("Y"));
    }

    public void addTask(Task task, boolean isNormalTask) {
        if(isNormalTask) {
            m_unfinished.addLast(task);
        }
        else {
            m_unfinished.addFirst(task);
        }
    }

    public Task getCurrentTask() {
        return m_unfinished.getFirst();
    }

    public void taskDone() {
        m_finished.addFirst(m_unfinished.removeFirst());
    }

    public String showFinishedTask() {
        return m_finished.toString();
    }

    public String showUnFinishedTask() {
        return m_unfinished.toString();
    }
}
