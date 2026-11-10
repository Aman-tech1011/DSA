
import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_parenthese {

    public static void main(String[] args) {
        String s = "()[]{}";

        Deque<Character> st = new ArrayDeque<>();

        Valid_parenthese obj = new Valid_parenthese();

        System.out.println(obj.checkValid(s, st));
    }

    public boolean checkValid(String s, Deque<Character> st) {

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {

                if (st.isEmpty()) {
                    return false;
                }

                if (ch == ')' && st.peek() != '(') {
                    return false;
                }

                if (ch == ']' && st.peek() != '[') {
                    return false;
                }

                if (ch == '}' && st.peek() != '{') {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}
