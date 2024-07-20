import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int n = piles.length;
        int maxCoins = 0;
        for (int i = 0; i < piles.length; i++) {
            System.out.println(piles[i]);
        }
        

        for (int i = n / 3; i < n; i += 2) {
            maxCoins += piles[i];
        }

        return maxCoins;
    }

     public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        Solution  sl = new Solution();
        int a = sl.maxCoins(piles);
        System.out.println("Maximum number of coins you can have: " +    a);
    }
}