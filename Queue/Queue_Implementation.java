// package Queue;

public class Queue_Implementation {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        // isEmpty
        public static boolean isEmpty(){
          return rear==-1;
        }
        // add
        public static void enqueue(int data){
            if(rear==size-1){
               System.out.print("Queue is full");
               return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        // remove
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0; i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        // peek
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
        // print
        public static void display(){
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.display();
    }
}
