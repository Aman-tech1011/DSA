public class Power_Cal {
    public static int power(int n,int k){
        if(k==0){
            return 1;
        }
        return n*power(n, k-1);
    }
    public static void main(String[] args) {
        int n=2,k=3;
        System.out.println(power(n, k));
    }
    
}
