import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class FrequencySort {
    
    public static String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        // Step 1: Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
System.out.println(frequencyMap);
      
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            char character = entry.getKey();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(character);
        }

        // Step 3: Build the result string from the buckets
        StringBuilder result = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println("Original string: " + s);
        String sortedString = frequencySort(s);
        System.out.println("Sorted string by frequency: " + sortedString);
    }
}

