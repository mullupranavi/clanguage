import java.util.Scanner;

public class ArrayQueue {
    private int rear, front, size;
    private int[] queue;

    public ArrayQueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        queue[++rear] = value;
        System.out.println("Operation: enqueue " + value);
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }
        System.out.println("Operation: dequeue " + queue[front++]);
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Initial queue size: ");
        int capacity = obj.nextInt();
        ArrayQueue q = new ArrayQueue(capacity);

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
