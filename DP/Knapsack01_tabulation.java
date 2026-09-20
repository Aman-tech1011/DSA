public class Knapsack01_tabulation {
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int w=7;
        int n=wt.length;
        int dp[][]=new int[n+1][w+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<w; j++){
                   if(n==0 || w==0){
                    dp[i][j]=0;
                   }
            }
        }
        // main condition
        for(int i=1; i<=n; i++){
            for(int j=1; j<=w; j++){
                if(wt[i-1] <= w){
                    int include=val[i-1]+dp[i-1][wt[]]
                }
            }
        }
    }
}
