// package Queue;

public class Queue_using_ll {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        public static Node head;
        public static Node tail;

        // check empty
        public static boolean isEmpty(){
            return head==null;
        }
        // add element in queue
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        // remove element from queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=head.data;
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return result;
        }
        // top element of queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
