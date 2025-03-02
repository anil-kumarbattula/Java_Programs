//Queue implementation using Linked List
public class Queue_LL {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Enqueue
    public void enQueue(int data) {
        Node temp = new Node(data);
        if(tail == null) {
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }
    //Dequeue
    public void deQueue() {
        if(head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        head = head.next;
    }
    //peek
    public void peek() {
        if(head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(head.data);
    }
    //print the queue
    public void printQueue() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + "<-");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]) {
        Queue_LL q = new Queue_LL();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.peek();
        q.deQueue();
        q.printQueue();
        q.peek();
    }

}
