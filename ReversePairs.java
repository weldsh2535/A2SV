 public class ReversePairs {

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        count += merge(nums, left, mid, right);
        return count;
    }

    private int merge(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merge step
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 1};
        ReversePairs solution = new ReversePairs();
        int result = solution.reversePairs(nums);
        System.out.println("The number of reverse pairs is: " + result);
    }
}

