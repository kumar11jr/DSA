public class evenOddArray {
    public static int[] funArray(int[] arr){
        int[] answer = new int[arr.length];
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                answer[even] = arr[i];
                even++;
            }
        }
        int odd =even++;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                answer[odd] = arr[i];
                odd++;
            }
        }
        return answer;
    }

    public static int[] funArray2(int[] arr) {
        int[] answer = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 1;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                answer[evenIndex] = arr[i];
                evenIndex += 2; // Move to the next even index
            } else {
                answer[oddIndex] = arr[i];
                oddIndex += 2; // Move to the next odd index
            }
        }
    
        return answer;
    }
    


    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        int[] array2 = funArray(array); 
        for (int i : array2) {
            System.out.println(i);
        }
        System.out.println("hello end");
    }
}
