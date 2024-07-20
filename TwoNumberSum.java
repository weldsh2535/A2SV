import java.util.HashMap;

public class TwoNumberSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference) + 1, i + 1 };
            }
            map.put(numbers[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arrayList = { 2, 7, 3, 4, 9 };
        int target = 9;
        TwoNumberSum solution = new TwoNumberSum();
        int[] result = solution.twoSum(arrayList, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
