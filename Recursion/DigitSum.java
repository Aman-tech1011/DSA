public class DigitSum {
    public static int digitSum(int digit){
        if(digit==0){
           return 0;
        }
        int n=digit%10;
        return n+digitSum(digit/10);
    }
    public static void main(String[] args) {
        int digit=4667;
        System.out.println(digitSum(digit));
    }
    
}
