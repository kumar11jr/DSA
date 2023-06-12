public class transpose {
    public static void transspose(int[][] arr){
        if (arr.length == arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            display(arr);
        }
        else{
            int[][] neew = new int[arr[0].length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    neew[j][i] = arr[i][j];
                }
            }
            display(neew);
        }
        
    }

    ///////////////////////////////////////////////// 90 degree clockwise

    private static void display(int[][] neew) {
        for (int[] row : neew) {
            for (int j : row) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void clockwise90(int[][] arr){
        
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-i-1][j];
                arr[arr.length-i-1][j] = temp;
            }
        }
        transspose(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }



    public static void main(String[] args) {
        int[][] arr = {{3,4},{5,7},{8,10}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transspose(arr);
    }

    
}
