public class pow{
    public static double power(int x,int n){
        // return Math.pow(x, n);
        double res = 1;
        if(x == 1 || n == 0){
            return res;
        }
        if(n<0){
            while (n!=0) {
                res *= (1/x);
                n++;
            }
            return res;
        }
        while (n!=0) {
            res *= x;
            n--;
        }
        return res;

    }
    public static void main(String[] args) {
        int x = 1;
        int n =  2147483647;

        System.out.println(power(x,n));
    }
}