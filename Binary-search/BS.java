//package Binary-search;

public class BS {
    public static int binarySearch(int nums[],int search){
        int start=0;
        int end=nums.length-1;

        while(start <= end){
            int mid=(start+end)/2;
            if(nums[mid]==search){
                return mid;
            }
            else if(search < nums[mid]){
              end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int search=4;
        System.out.println(binarySearch(nums, search));
    }
}
