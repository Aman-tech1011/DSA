//package Sliding-window;

public class Maximum_sum {
    public static void main(String[] args) {
        int arr[]={100,200,300,400}; 
        int i=0,j=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int k=2;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1==k){
                maxSum=Math.max(maxSum, sum);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println("Maximum sum of size k : "+maxSum);
    }
}
