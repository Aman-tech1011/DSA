public class L_1004 {
    public  static void maxLengthOfOnesWithTwoZeroes(int nums[],int k){
        int n=nums.length;
        int maxLength=0;
        int zeroes;
        for(int i=0; i<n; i++){
           zeroes=0;
           for(int j=i; j<n; j++){
            if(nums[j]==0){
                zeroes++;
            }
            if(zeroes <= k){
                 maxLength=Math.max(maxLength, j-i+1);
            }
            else{
                break;
            }
           }
        }
        System.out.println("Maximum length of 1's with 2 zeroes : "+maxLength);
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        maxLengthOfOnesWithTwoZeroes(nums, 2);
    }    
}
