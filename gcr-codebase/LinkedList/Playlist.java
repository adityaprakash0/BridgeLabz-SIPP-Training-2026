class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Playlist {

    public static void insertAfter(Node current, int trackId) {
        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);

        newNode.next = current.next;

        current.next = newNode;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Insertion:");
        printList(head);

        insertAfter(head.next, 25);

        System.out.println("After Insertion:");
        printList(head);
    }
}
