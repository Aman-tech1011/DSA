public class Tiles_problem {
    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int v=tiling_problem(n-1);
        int h=tiling_problem(n-2);

        return v+h;
    }
    public static void main(String[] args) {
        System.out.println("No of ways : "+tiling_problem(3));
    }
}
