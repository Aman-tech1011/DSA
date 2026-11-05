import java.util.ArrayDeque;
import java.util.Deque;

public class Middle {
    public static void printMiddle(Deque<Integer>st,int count,int size){
        if(count==size/2){
            System.out.println("Middle Element : "+st.peek());
            return;
        }
        st.pop();
        count++;
        printMiddle(st, count, size);

    }
    public static void main(String[] args) {
        Deque<Integer>st=new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int count=0;
        int size=st.size();
        printMiddle(st, count, size);
    }
}
