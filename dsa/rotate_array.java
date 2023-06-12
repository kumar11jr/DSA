public class rotate_array {
    public static void rotate(int[] arr,int k){
        // while (k!=0) {
        //     int temp = arr[arr.length-1];
        //     for (int i = arr.length-1; i > 0; i--) {
        //         arr[i] = arr[i-1];
        //     }
        //     arr[0] = temp;
        //     k--;
        // }
        // for (int i : arr) {
        //     System.out.println(i);
        // }





//************************************************************************************************************************** */
        if (arr == null || arr.length == 0) {
            return;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[(i+k)%arr.length] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rotate(arr,3);
    }
}
