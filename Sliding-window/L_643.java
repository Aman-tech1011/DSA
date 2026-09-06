public class L_643 {
    public static double maxAvg(int nums[],int k){
        int n=nums.length;
        int start=0;
        int end=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        while(end <n){
            sum+=nums[end];
            if(end == k){
                maxSum =Math.max(maxSum, sum);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        // for return max sum
        //return maxSum;
        // for return avg max sum
        return  (double)maxSum/k;
    }
      public static void main(String[] args) {
        int nums[]={7,6,1,2,4,5,9};
        System.out.println("maximum sum is : "+maxAvg(nums, 4));
      }    
}
