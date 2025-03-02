

public class Linked_list {
    Node head;
    private int size;

    Linked_list(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add First
    public void addFirst(int data){
        Node newNode = new Node(data); //* 
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    //add at particular position
    public void addPosition(int idx, int data){
        
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(idx == 0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode=head;
        for(int i = 0; i < idx-1 && currNode != null; i++){
            currNode = currNode.next;
        }
        if(currNode == null){
            System.out.println("Index is out of range");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    //delete at First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    //delete at particular position
    public void deletePosition(int idx){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(idx == 0){
            head = null;
            return;
        }
        Node currNode = head;
        for(int i = 0; i < idx-1 && currNode  != null; i++){
            currNode = currNode.next;
        }
        if(currNode == null){
            System.out.println("Index is out of range");
            return;
        }
        currNode.next = currNode.next.next;

    }
    //print Nodes
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]) {
        Linked_list list = new Linked_list();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(0);
        list.addLast(3);
        list.printList();
        list.addPosition(2,7);
        list.addPosition(1,8);
        list.deletePosition(1);
        list.printList();
    }

}
