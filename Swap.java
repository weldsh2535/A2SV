class Palindrome {
    public boolean isPalindrome(int x) {
        int rem = 0;
        int sum = 0;
        int y = x;
        while(x>0){
          
           rem = x % 10 ;
           x = x /10;
            sum = sum * 10 + rem ;
        }
        if(y == sum){
          return true; 
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Palindrome sol = new Palindrome();
        sol.isPalindrome(121);
    }
}
