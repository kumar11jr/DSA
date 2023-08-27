public class interval_between_identical_elements {
    public static long[] getDistanceBetween(int[] arr){
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] && i!=j) {
                    result[i] += (long) Math.abs(i-j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,1,2,3,3};
        long[] answer = getDistanceBetween(arr);
        for (long l : answer) {
            System.out.println(l);
        }
    }
}
