import java.util.*;

public class PrintNegativeNumber {
    public static void printNegative(int nums[],int k){
        int i=0,j=0;
        List<Integer>ans=new ArrayList<>();
        int negative=0;
        while(j < nums.length){
            if(nums[j] < 0){
              if(negative==0){
                negative=nums[j];
              }
            }
            if(j-i+1 <k){
                j++; 
            }else if(j-i+1==k){
               ans.add(negative);
               if(nums[i]==negative){
                negative=0;
               }
               i++;
               j++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int nums[]={12,-1,-7,8,9,-15,5};
        printNegative(nums, 3);
    }
}
