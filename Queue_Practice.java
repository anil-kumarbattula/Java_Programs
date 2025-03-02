public class Queue_Practice {
    static class Queue{
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty(){
            return(front == -1 && rear == -1);
        }

        public boolean isFull(){
            return ((rear+1) % size == front);
        }

        //enqueue
        public void add(int data) {
            if(isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        //Dequeue
        public void remove(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return ;
            }
            
            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

        }
        // peek at First Element
        public void peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            else
            System.out.println(arr[front]);
        }

        }
        public static void main(String args[]) {
            Queue a = new Queue(5);
            a.add(1);
            a.add(2);
            a.add(3);
            a.remove();
            a.peek();
    }
}
