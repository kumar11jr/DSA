public class Divide_Two_Integers {
    public static int divide(int dividend,int divisor){
         // handle divisibility by 0
         if (divisor == 0)
         {
            System.exit(-1);
         }
  
         int sign = 1;
         if (dividend * divisor < 0) {
             sign = -1;
         }
  
        
         long x = Math.abs((long)dividend);
         long y = Math.abs((long)divisor);
  
        
         int quotient = 0;
  
        
         while (x >= y)
         {
             x = x - y;    
             quotient++;     
         }
        return sign * quotient;
    }
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(divide(dividend,divisor));
    }
}
