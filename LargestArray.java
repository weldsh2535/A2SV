public class LargestArray {
    public int getMax(int[] arr){
        int large = arr[0];
       for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                large = arr[i];
            }
          }
        return large;
    }
    public static void main(String[] args){
       int[] arr = {2,1,3,5,7};
       LargestArray largestArray = new LargestArray();
       int max = largestArray.getMax(arr);
       System.out.println("The largest number is "+ max);
    }
}
