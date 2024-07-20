public class Sort {
    public int[] sortA(int[] arraylists){
        
       for (int index = 1; index < arraylists.length; index++) {
        int j = index;
        while (j>0 && arraylists[j-1] > arraylists[j]) {
            int temp =   arraylists[j - 1] ;
            arraylists[j - 1] = arraylists[j];
            arraylists[j] = temp;
            j--;
        }
       }
      return arraylists;
    }
    
 public static void main(String[] args){
    int[] a = {2,1,3,5,6,4};
    Sort sort = new Sort();
    sort.sortA(a);
    for (int index = 0; index < a.length; index++) {
        System.out.println(a[index]);
    }
   
 }
}
