import java.util.*;

public class PrintNonrepeating {
    public static void printNonrepeatingString(String str){
        int fre[]=new int[26];
        Queue<Character>q=new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            q.add(ch);
            fre[ch-'a']++;

            while(!q.isEmpty() && fre[q.peek()-'a'] > 1){
                  q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        printNonrepeatingString(str);
    }
}
