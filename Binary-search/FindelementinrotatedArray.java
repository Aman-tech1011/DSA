class  FindelementinrotatedArray{

    // Find index of minimum element (pivot)
    public int findMin(int nums[]) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            // Array is already sorted
            if (nums[start] <= nums[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;

            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // mid is minimum
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            // Left part is sorted
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }

            // Minimum is in left part
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Normal Binary Search
    public int bs(int nums[], int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public boolean search(int[] nums, int target) {

        int n = nums.length;

        // Find minimum element index
        int index = findMin(nums);

        // Search in left sorted part
        int left = bs(nums, 0, index - 1, target);

        if (left != -1) {
            return true;
        }

        // Search in right sorted part
        int right = bs(nums, index, n - 1, target);

        return right != -1;
    }
}