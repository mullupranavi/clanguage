import java.util.Scanner;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

       public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }

        if (front == -1) { // first element
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Operation: enqueue " + value);
    }

       public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }

        System.out.println("Operation: dequeue " + queue[front]);

        if (front == rear) { 
             front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial queue size: ");
        int capacity = scanner.nextInt();
        CircularQueue q = new CircularQueue(capacity);

        System.out.println("\nCommands:");
        System.out.println("ENQ <number>");
        System.out.println("DEQ");
        System.out.println("DIS");
        System.out.println("EXIT");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.next().toUpperCase();

            switch (command) {
                case "ENQ":
                    int value = scanner.nextInt();
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
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
