import java.util.ArrayList;

import javax.xml.stream.EventFilter;

public class spiral_matrix {
    public static ArrayList<Integer> spiral(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;

        int topRow = 0, bottomRow = rows - 1;
        int leftColumn = 0, rightColumn = columns - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            // Traverse the top row
            for (int i = leftColumn; i <= rightColumn; i++) {
                list.add(matrix[topRow][i]);
            }
            topRow++;

            // Traverse the right column
            for (int i = topRow; i <= bottomRow; i++) {
                list.add(matrix[i][rightColumn]);
            }
            rightColumn--;

            if (topRow <= bottomRow) {
                // Traverse the bottom row
                for (int i = rightColumn; i >= leftColumn; i--) {
                    list.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {
                // Traverse the left column
                for (int i = bottomRow; i >= topRow; i--) {
                    list.add(matrix[i][leftColumn]);
                }
                leftColumn++;
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int[][] given = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};


        for (int[] is : given) {
            for (int is2 : is) {
                System.out.print(is2 +" ");
            }
            System.out.println();
        }

       System.out.println(spiral(given)); 
    }
}
