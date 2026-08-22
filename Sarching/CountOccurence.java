package Sarching;

public class CountOccurence {
    public static int firstOccurence(int arr[],int target){
        int low=0;
        int high=arr.length;
        int firstOccurence=-1;
         while(low <= high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
               firstOccurence=mid;
               high=mid-1;
            }else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }  
        }
        return firstOccurence;
    }

     public static int lastOccurence(int arr[],int target){
        int low=0;
        int high=arr.length;
        int lastOccurence=-1;
         while(low <= high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
               lastOccurence=mid;
               low=mid+1;
            }else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }  
        }
        return lastOccurence;
    }   
    public static void main(String[] args) {
        int arr[]={10,20,25,25,25,30,30};
        int target=25;

        int a=firstOccurence(arr, target);
        int b=lastOccurence(arr, target);

        int count=b-a+1;

        System.out.print("Total count : "+count);
    }
}
