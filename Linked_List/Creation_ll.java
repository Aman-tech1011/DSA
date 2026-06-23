package Linked_List;

public class Creation_ll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    // creating Node at first
    public static void atFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        // logic
        newNode.next = head;
        head = newNode;
    }

    // create a node at last
    public static void atLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // create a node at middle of linked list
    public static void atMiddle(int data,int pos){
        if(pos==0){
            atFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0; i<pos-1; i++){
            temp=temp.next;
        }
       newNode.next=temp.next;
       temp.next=newNode;

    }
//-----------------------------------------------removal-------------------------------
    public static int removeAtFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return -1;
        }
       int temp=head.data;
       head=head.next;
       return temp;
    }   
 //----------------------------------------------------------------------------------
//calculate yhe size of ll
    public static void size(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
       // int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        System.out.println("linked list size is: "+size);
    }     
    // display the linked list
    public static void display(){
        Node temp=head;
        if(head==null){
            System.out.println("linked is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //------------iterative search------------------
    public static int iterativeSearch(int key) {
    Node temp = head;
    int index = 0;

    while (temp != null) {
        if (temp.data == key) {
            return index;
        }
        temp = temp.next;
        index++;
    }

    return -1;
}
    public static void main(String[] args) {
        Creation_ll ll = new Creation_ll();
        ll.atFirst(3);
        ll.atFirst(1);
        ll.atLast(4);
        ll.atLast(6);
        ll.atFirst(5);
        ll.atMiddle(9, 2);
        ll.removeAtFirst();
        ll.removeAtFirst();
        ll.display();
        ll.size();
        System.out.println(ll.iterativeSearch(4));

    }
}
