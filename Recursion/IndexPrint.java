import java.util.*;

public class IndexPrint {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        List<Integer>list=new ArrayList<>();
        searching(arr,list,key,0);
        for(int j=0; j<list.size(); j++){
            System.out.print(list.get(j)+" ");
        }
    }
    public static void searching(int arr[],List<Integer>list,int key,int i){
        int n=arr.length;
        if(n==i){
            return;
        }
        if (arr[i]==key) {
            list.add(i);
        }

        searching(arr, list, key, i+1);  
    }
}
