package datastructures.lists;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeLast() {

        // Caso 1: lista vazia
        if (head == null) {
            return;
        }

        // Caso 2: apenas um elemento
        if (head.next == null) {
            head = null;
            return;
        }

        // Caso 3: dois ou mais elementos
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

}