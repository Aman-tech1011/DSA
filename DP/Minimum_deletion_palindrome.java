public class Minimum_deletion_palindrome {
    public static int lcs(String s1,String s2,int m,int n,int dp[][]){
        // base condition
     for(int i=0; i<=m;i++){
        for(int j=0; j<=n; j++){
            if(i==0 || j==0){
                dp[i][j]=0;
            }
        }
     }
     // logic
     for(int i=1; i<=m; i++){
        for(int j=1; j<=n; j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
     }
     return dp[m][n];
    }
    public static void main(String[] args) {
        String s="agbcba";
        String rev=new StringBuilder(s).reverse().toString();
        int m=s.length();
        int n=rev.length();

        int dp[][]=new int[m+1][n+1];
        System.out.println(m-lcs(s, rev, m, n, dp));
        
    }
}
