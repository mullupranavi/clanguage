import java.util.Scanner;

public class LinkedQueue {
    public static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node front, rear;

    public LinkedQueue() {
        front = rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Operation: enqueue " + value);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }
        System.out.println("Operation: dequeue " + front.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        LinkedQueue q = new LinkedQueue();
        System.out.println("\nCommands:");
        System.out.println("ENQ <number>");
        System.out.println("DEQ");
        System.out.println("DIS");
        System.out.println("EXIT");

        while (true) {
            System.out.print("Enter command: ");
            String command = obj.next().toUpperCase();

            switch (command) {
                case "ENQ":
                    int value = obj.nextInt();
                    q.enqueue(value);
                    q.display();
                    break;
                case "DEQ":
                    q.dequeue();
                    q.display();
                    break;
                case "DIS":
                    q.display();
                    break;
                case "EXIT":
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
































































































































































































































































































































































































