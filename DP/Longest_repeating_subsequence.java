public class Longest_repeating_subsequence {
    public static void main(String[] args) {
        String s="AABEBCDD";
        String a,b;
        a=s;
        b=s;
        int m=a.length();
        int n=b.length();

        int dp[][]=new int[m+1][n+1];
        // intialize
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        // choice
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(a.charAt(i-1)==b.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
