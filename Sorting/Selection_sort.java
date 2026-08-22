public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
