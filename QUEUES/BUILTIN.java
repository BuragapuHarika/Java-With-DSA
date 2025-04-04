import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BUILTIN {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Enqueue some values
        System.out.print("Enter a number to enqueue: ");
        int data = sc.nextInt();
        queue.add(data); // enqueue
        System.out.println("Queue: " + queue);
        System.out.println("Enqueued: " + data);
        System.out.print("Enter a number to enqueue: ");


        // Peek
        System.out.println("Peek: " + queue.peek());

        // Dequeue
        System.out.println("Dequeued: " + queue.remove());

        // Display
        System.out.println("Queue after dequeue: " + queue);

        sc.close();
    }
}

