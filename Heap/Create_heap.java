import java.util.ArrayList;

public class Create_heap {
    public static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
         
        // insert at last
        public  void insert(int data){
            // insert at last
            arr.add(data);

            int x=arr.size()-1;
            int pr=(x-1)/2;

            while(arr.get(x) < arr.get(pr)){
                //swap
                int temp=arr.get(x);
                arr.set(x, arr.get(pr));
                arr.set(pr,temp);
            }
        }
        // access the top element(min)
        public int top(){
            return arr.get(0);
        }
           // Display heap
        public void display() {
            System.out.println("Heap: " + arr);
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.insert(4);
        h.insert(1);
        h.insert(3);
        h.insert(2);
        
        int min=h.top();
        h.display();
        System.out.println(min);
    }
}
