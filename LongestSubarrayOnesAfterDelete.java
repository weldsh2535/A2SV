public class LongestSubarrayOnesAfterDelete {

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int maxLen = 0;
        int countOnes = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 1) {
                countOnes++;
            }

            // If we have more than one zero in the window, move left to shrink the window
            while (right - left + 1 - countOnes > 1) {
                if (nums[left] == 1) {
                    countOnes--;
                }
                left++;
            }

            // Update maxLen with the current window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // If maxLen is equal to nums.length, we need to delete one element to get the longest subarray of 1s
        if (maxLen == nums.length) {
            return maxLen - 1;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1};
        System.out.println("Output for nums1: " + longestSubarray(nums1)); // Output: 3
        
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println("Output for nums2: " + longestSubarray(nums2)); // Output: 5
        
        int[] nums3 = {1, 1, 1};
        System.out.println("Output for nums3: " + longestSubarray(nums3)); // Output: 2
    }
}
