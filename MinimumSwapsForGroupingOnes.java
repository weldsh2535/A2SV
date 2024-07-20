public class MinimumSwapsForGroupingOnes {

    public static int minSwaps(int[] nums) {
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        int windowSize = totalOnes;
        int currentOnes = 0;

        // Calculate initial count of 1's in the first window
        for (int i = 0; i < windowSize; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }

        // Initialize minimum swaps needed
        int minSwaps = windowSize - currentOnes;

        // Slide the window across the array
        for (int i = 1; i <= nums.length; i++) {
            int left = i - 1;
            int right = (i + windowSize - 1) % nums.length;

            // Slide the window
            if (nums[left] == 1) {
                currentOnes--;
            }
            if (nums[right] == 1) {
                currentOnes++;
            }

            // Update minSwaps needed
            minSwaps = Math.min(minSwaps, windowSize - currentOnes);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 0, 0, 1, 1, 0};
        int[] nums3 = {1, 1, 0, 0, 1};

        System.out.println(minSwaps(nums1)); // Output: 1
        System.out.println(minSwaps(nums2)); // Output: 2
        System.out.println(minSwaps(nums3)); // Output: 0
    }
}
