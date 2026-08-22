public class PrintBinaryString {

    public static void main(String[] args) {
        int n = 3;

        printBinary(n, 0, "");
    }

    public static void printBinary(int n, int lastDigit, String str) {

        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Add 0
        printBinary(n - 1, 0, str + "0");

        // Add 1 only if previous digit is 0
        if (lastDigit == 0) {
            printBinary(n - 1, 1, str + "1");
        }
    }
}