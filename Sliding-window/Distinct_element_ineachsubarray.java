import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Distinct_element_ineachsubarray {
    public static List slove(int nums[],int k){
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        int i=0, j=0;
        while (j < nums.length) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0)+1);
             if(j-i+1==k){
                list.add(mp.size());
                mp.put(nums[i], mp.get(nums[i])-1);
                if(mp.get(nums[i])==0){
                    mp.remove(nums[i]);
                }
                i++;
             }
             j++;
        }
       return list;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,4,2,3};
        List<Integer>list=slove(nums, 4);
        System.out.println(list);
    }
}
