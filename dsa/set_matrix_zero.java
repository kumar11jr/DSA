public class set_matrix_zero {
    public static void set(int i,int j, int[][] arr){

    }
    public static void set_zero(int[][] arr){
        int[][] neew = new int[arr.length][arr[0].length];
        for (int i = 0; i < neew.length; i++) {
            for (int j = 0; j < neew[i].length; j++) {
                neew[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                
                if (arr[i][j] == 0) {
                    for (int j2 = 0; j2 < arr.length; j2++) {
                        neew[j2][j]=0;
                    }
                    for (int j2 = 0; j2 < arr[0].length; j2++) {
                        neew[i][j2]=0;
                    }
                }
                
            }
        }
        display(neew);

    }
    private static void display(int[][] neew) {
        for (int[] row : neew) {
            for (int j : row) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        set_zero(mat);
    }
}
