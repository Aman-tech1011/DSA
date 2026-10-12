public class Next_Greater {
    public static void main(String[] args) {
        char ch[]={'a','c','f','h'};
        int key='f';

        int start=0;
        int end=ch.length-1;
        char res='\0';
        while(start <= end){
          int mid=start+(end-start)/2;
          if(ch[mid]==key){
            start=mid+1;
          }else if(ch[mid] < key){
            start=mid+1;
          }else if(ch[mid] > key){
            res=ch[mid];
            end=mid-1;
          }
        }
        System.out.println(res);
    }
}
