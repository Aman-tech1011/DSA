public class FirstandLastOcurence {
    public static int firstOcurrence(int nums[],int key){
        int start =0;
        int end=nums.length-1;
        int res=-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                res=mid;
                end=mid-1;
             //  last ocurennce    start=mid+1; 
            }
            else if(key < nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={15,13,12,11,11,11,11,7,1};
        int key=11;
        System.out.println(firstOcurrence(nums, key));
    }
}
