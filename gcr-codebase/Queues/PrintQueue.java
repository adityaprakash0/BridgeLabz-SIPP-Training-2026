import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> queue;

    public PrintQueue() {
        queue = new ArrayDeque<>();
    }

    public void addLast(int jobId) {
        queue.addLast(jobId);
        System.out.println("Normal Job Added: " + jobId);
    }

    public void addFirst(int jobId) {
        queue.addFirst(jobId);
        System.out.println("Urgent Job Added: " + jobId);
    }

    public int removeFirst() {
        if (queue.isEmpty()) {
            System.out.println("No Jobs in Queue");
            return -1;
        }
        return queue.removeFirst();
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Print Queue is Empty");
            return;
        }

        System.out.println("Current Print Queue: " + queue);
    }

    public static void main(String[] args) {

        PrintQueue pq = new PrintQueue();

        pq.addLast(101);
        pq.addLast(102);
        pq.addLast(103);

        pq.display();

        pq.addFirst(999);

        pq.display();

        System.out.println("\nPrinting Job: " + pq.removeFirst());
        System.out.println("Printing Job: " + pq.removeFirst());

        System.out.println();

        pq.display();
    }
}
