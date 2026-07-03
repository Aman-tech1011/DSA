// package Queue;

public class Circular_queue {
    public static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // check empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // check full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.print("Queue is full");
                return;
            }
            // element add at first
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // print
        public static void display() {
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % size;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.display();

    }
}
