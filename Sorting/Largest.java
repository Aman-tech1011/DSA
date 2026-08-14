//package Sorting;

public class Largest {
    public static void main(String[] args) {
        int arr[]={50,30,70,28,65};
        
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           if(max < arr[i]){
            secondMax=max;
            max=arr[i];
           }else if(secondMax < arr[i] && arr[i]!=max){
            secondMax=arr[i];
           }
        }
        System.out.print("Second largest element "+secondMax);

    }
}
