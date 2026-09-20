public class Maximum_subarray_sum {
    public static int maxSum(int nums[],int k){
        int i=0,j=0;
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;

        while(j < n){
            sum+=nums[j];

            if(j-i+1 ==k){
                max=Math.max(max,sum);

                sum-=nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2,3,5,29,7,1};
        System.out.println("Maximum sum : "+maxSum(nums, 3));
    }
}
