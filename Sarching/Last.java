package Sarching;

public class Last {
    public static void main(String[] args) {
        int arr[]={10,20,25,25,25,30,30};
        int low=0;
        int high=arr.length-1;
        int result=-1;
        int target=25;
        while(low <= high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
               result=mid;
               low=mid+1;
            }else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       // System.out.println("First Occurence : "+result);
        System.out.println("Last Occurence : "+result);
    }
}
