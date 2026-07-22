public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) {
            System.out.println("Buffer is Full. Packet Rejected.");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Buffer is Empty.");
            return -1;
        }

        int packet = data[front];
        front = (front + 1) % data.length;
        count--;
        return packet;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Buffer is Empty");
            return;
        }

        System.out.print("Packets in Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        buffer.enqueue(104);
        buffer.enqueue(105);

        buffer.display();

        buffer.enqueue(106);

        System.out.println("\nProcessed Packet: " + buffer.dequeue());
        System.out.println("Processed Packet: " + buffer.dequeue());

        buffer.display();

        buffer.enqueue(106);
        buffer.enqueue(107);

        System.out.println("\nAfter Adding New Packets:");
        buffer.display();
    }
}
