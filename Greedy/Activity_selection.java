package Greedy;

import java.util.ArrayList;

public class Activity_selection{
    public static void main(String[] args) {
        int start[]={10,12,30};
        int end[]={20,25,30};

        int maxCount=0;
        ArrayList<Integer>ans=new ArrayList<>();

        maxCount=1;
        ans.add(0);
        int lastEndingINdex=end[0];
        for(int i=1; i<end.length; i++){
          if(lastEndingINdex <= start[i]){
            maxCount++;
            ans.add(i);
            lastEndingINdex=end[i];
          }
        }
        System.out.println("total Activity found are : "+ maxCount);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}