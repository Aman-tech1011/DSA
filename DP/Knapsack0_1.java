public class Knapsack0_1 {
    public static int knapsack(int wt[], int val[], int w, int n,int dp[][]){
        if(n==0 || w==0){
            return 0;
        }
        if(dp[n][w] !=-1){
            return dp[n][w];
        }
        if(wt[n-1] <= w){
          int include=val[n-1]+knapsack(wt, val, w-wt[n-1], n-1, dp);
          int exclude=knapsack(wt, val, w, n-1, dp);
          dp[n][w]=Math.max(include, exclude);
          return dp[n][w];
        }
        else{
            dp[n][w]=knapsack(wt, val, w, n-1, dp);
            return dp[n][w];
        }
    }
    public static void main(String[] args) {
         int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int w=7;
        int n=wt.length;
        int dp[][]=new  int[val.length+1][w+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println("Maximum profit : "+knapsack(wt, val, w, n, dp));
    }
}
