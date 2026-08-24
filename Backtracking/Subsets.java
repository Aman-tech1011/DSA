//package Backtracking;

public class Subsets {
    public static void printSubsets(String str,String ans,int i){
        //base case
        if(str.length()==i){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                  System.out.println(ans);
            }
            return;
        }
        //recursion
        //-> yes choice
        printSubsets(str, ans+str.charAt(i), i+1);
        //-> No choice
        printSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        printSubsets(str, "", 0);
    }
}
