public class Longest_subarray_condition {
    public static void longestSubArray(int nums[],int x){
        int i=0,j=0;
        int maxLength=0;
        int sum=0;
        while(j < nums.length){
            sum+=nums[j];
            if(sum > x){
                sum-=nums[i];
                i++;
            }
            if(sum <= x){
                maxLength=Math.max(maxLength, j-i+1);
            }
            j++;
        }
        System.out.println("Maximum length : "+maxLength);
    }
    public static void main(String[] args) {
        //arr = [2, 1, 5, 1, 3, 2]
        int nums[]={2,1,5,1,3,2};
        longestSubArray(nums, 10);
    }
}
