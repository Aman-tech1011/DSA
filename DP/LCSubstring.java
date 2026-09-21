public class LCSubstring {
    public static void main(String[] args) {
               String text1="abcde";
          String text2="ace";

          char []s1=text1.toCharArray();
          char []s2=text2.toCharArray();

          int m=s1.length;
          int n=s2.length;

          int dp[][]=new int[m+1][n+1];
// base condition
          for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
          }
// choice
          for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
          }   
          System.out.println(dp[m][n]);
    }
    
}
