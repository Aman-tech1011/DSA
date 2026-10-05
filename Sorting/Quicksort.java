public class Quicksort {

    // Quick Sort
    public static void quickSorting(int nums[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int pindex = partition(nums, si, ei);

        quickSorting(nums, si, pindex - 1);
        quickSorting(nums, pindex + 1, ei);
    }

    // Partition
    public static int partition(int nums[], int si, int ei) {

        int pivot = nums[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (nums[j] <= pivot) {

                i++;

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        // Put pivot at correct position
        i++;

        int temp = nums[ei];
        nums[ei] = nums[i];
        nums[i] = temp;

        return i;
    }

    // Print
    public static void printArr(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int nums[] = {6, 3, 9, 8, 2, 5};

        quickSorting(nums, 0, nums.length - 1);

        printArr(nums);
    }
}