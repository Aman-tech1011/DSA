import java.util.Stack;

public class Insert_stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(4);
        st.push(2);
        st.push(1);

        int x = 3;

        insert(st, x);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void insert(Stack<Integer> st, int x) {

        // Base condition
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();

        // x ko correct position par insert karo
        if (top > x) {

            insert(st, x);

            // jo element nikala tha, wapas push
            st.push(top);

        } else {

            st.push(top);
            st.push(x);
        }
    }
}