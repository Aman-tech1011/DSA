import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubarray {
    public static List sumofSubArr(int nums[],int k,ArrayList<Integer>list){
        int i=0,j=0;
        int sum=0;
       // ArrayList<Integer>list=new ArrayList<>();

        while(j < nums.length){
            sum+=nums[j];
            if(j-i+1==k){
                list.add(sum);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return list;
        // for(int l=0; l<list.size(); l++){
        //   System.out.print(list.get(l)+" ");
        // }
    }

    public static void main(String[] args) {
        int nums[]={1,-2,3,-4,5,6};
        ArrayList<Integer>list=new ArrayList<>();
        List<Integer>result=sumofSubArr(nums, 2, list);
        System.out.println(result);
        
    }
}
