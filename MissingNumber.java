import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] a = { 2, 1, 4 };

        System.out.println(sort(a));
    }

    public static int sort(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        
        for ( j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
      return j;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
