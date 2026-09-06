// package DP;

public class Fab {
    public static void fabonacci(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<dp.length; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int i=0; i<dp.length; i++){
            System.out.println(dp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        fabonacci(n);
    } 
}
