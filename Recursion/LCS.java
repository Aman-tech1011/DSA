public class LCS {
    public static int longestString(char []s1,char []s2,int m,int n){
       if(m==0 || n==0){
        return 0;
       }
       
       if(s1[m-1]==s2[n-1]){
            return 1+longestString(s1, s2, m-1, n-1);
       }
       else{
        return Math.max(longestString(s1, s2, m-1, n),longestString(s1, s2, m, n-1));
       }
    }
  public static void main(String[] args) {
    String text1="abcde";
    String text2="ace";
    char [] s1=text1.toCharArray();
    char [] s2=text2.toCharArray();
    int m=s1.length;
    int n=s2.length;

    System.out.println(longestString(s1, s2, m, n));
  }    
}
