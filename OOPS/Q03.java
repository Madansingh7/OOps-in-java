 // Write a Java program that implements a queue.  
   
import java.util.Scanner;

class Queue {
    int front, rear, max;
    int[] queue;

    // Constructor
    Queue(int size) {
        max = size;
        queue = new int[max];
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted element: " + queue[front++]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(" "+queue[i]);
            }
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue q = new Queue(size);

        int choice, value;

        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
