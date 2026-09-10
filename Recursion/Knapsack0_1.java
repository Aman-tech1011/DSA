public class Knapsack0_1 {
    public static int knapsack(int wt[],int val[],int n,int capacity){
        if(capacity==0 || n==0){
            return 0;
        } 
        if(wt[n-1] <= capacity){
            int include=val[n-1]+knapsack(wt, val, n-1, capacity-wt[n-1]);
            int exclude=knapsack(wt, val, n-1, capacity);

            return Math.max(include,exclude);
        }
        else{
            return knapsack(wt, val, n-1, capacity);
        }
    }
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int capacity=7;
        int n=wt.length;
        System.out.println(knapsack(wt, val, n, capacity));
    }
}
