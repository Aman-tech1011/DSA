//package Sliding-window;

import java.util.*;

public class Maximum_sum {
    public static void main(String[] args) {
       // ArrayList<Integer>list=new ArrayList<>();
        int arr[]={1,4,2,10,23,3,1,0,20}; 
        int i=0,j=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int k=4;
        int start=0;
        int end=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1==k){
                if(sum >maxSum ){
                   maxSum=sum;
                   start=i;
                   end=j;
                }
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println("Maximum sum of size k : "+maxSum);
        for(int x=start; x<=end; x++){
            System.out.print(arr[x]+" ");
        }
    }
}
