import java.util.HashMap;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement) + 1, i + 1 };
            }
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] numbers = {2, 7, 11, 15};
        int target = 26;
        int[] result = solution.twoSum(numbers, target);
       System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
