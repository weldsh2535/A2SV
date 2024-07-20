public class multiple {
    public int divide(int dividend, int divisor) {
        int res;
        if(divisor > 0 && dividend > 0){
          res = dividend/divisor;
        }
        else if(divisor < 0 && dividend < 0){
          res =  (-1*dividend) / (-1*divisor);
        }else{
          res =  dividend/divisor;
        }
        return res;
    }
    public static void main(String[] args) {
        multiple m = new multiple();
        System.out.println(m.divide(-1000, -1));
    }
}
