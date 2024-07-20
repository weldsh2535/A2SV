import java.util.Arrays;

public class CountingSort {
    
    public int[] sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min +1;
        int [] count = new int[range];
        int [] output = new int[arr.length];

        for(int j:arr){
            count[j - min]++;
        }

        for(int i =1; i<count.length;i++){
            count[i]+=count[i-1];
        }

        for (int i = arr.length -1 ; i >=0; i--) {
            output[count[arr[i]-min]-1] = arr[i];
            count[arr[i]-min]--;
        }
        return count;
    }
    public static void main(String[] args ){
        int[] arrayList = { 2, 7, 3, 4, 9 };
        CountingSort countingSort = new CountingSort();
      int[] a =  countingSort.sort(arrayList);
      for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
      }
    }
}
