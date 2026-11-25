package streamQuestions.dsa.linkedList;

public class Day1SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insetAtEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void deleteAtBeg() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            deleteAtBeg();
            return;
        }
        Node temp = head;
        while (temp.next.data == value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Day1SinglyLinkedList singlyLinkedList = new Day1SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(10);
        singlyLinkedList.insertAtBeginning(20);
        singlyLinkedList.insertAtBeginning(30);
        singlyLinkedList.insetAtEnd(50);

        singlyLinkedList.display();
    }
}
