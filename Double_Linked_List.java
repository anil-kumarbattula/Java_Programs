public class Double_Linked_List {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //add at First
    public void addFirst(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = temp;
            tail = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    //add at End
    public void addEnd(int data) {
        Node temp = new Node(data);
        if(tail == null) {
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;

    }
    //To print the linked list
    public void printList() {
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "<->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Double_Linked_List list = new Double_Linked_List();
        list.addFirst(1);
        list.addFirst(0);
        list.printList();
    }
}
