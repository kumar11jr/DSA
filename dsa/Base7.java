public class Base7 {
    public static String convertToBase7(int num){
        int count = 0;
        int newNo = 0;
        while(num!=0){
            int remainder = num%7;
            newNo += remainder*Math.pow(10, count);
            count++;
            num = num/7;
        }
        return Integer.toString(newNo);
    } 
    public static void main(String[] args) {
        int num =  123;
        System.out.println(convertToBase7(num));
    }
}
