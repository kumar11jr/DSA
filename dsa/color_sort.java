public class color_sort {

    public static void sorting(int[]  num){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]>num[j]) {
                    int temp = 0;
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        } 
        for (int i : num) {
            System.out.print(i);
        }   
    }
    public static void main(String[] args) {
        int[] num = {0,1,0,2,2,0,1};
        sorting(num);
    }
}
