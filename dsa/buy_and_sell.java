public class buy_and_sell {
    public static int profit(int[] stock) {
        if (stock== null || stock.length==0) {
            return 0;
        }
        int min = stock[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < stock.length; i++) {
            int money = stock[i]-min;
            if (money>max) {
                max=money;
            }
            if (stock[i]<min) {
                min=stock[i];
            }
           
        }   
        return max;
    }
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        System.out.println(profit(stocks));
        // System.out.println(nrprofit(stocks));
    }
}
