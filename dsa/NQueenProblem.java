public class NQueenProblem {
    private int N;

    public NQueenProblem(int N) {
        this.N = N;
    }

    // Method to solve the N-Queen problem
    public void solveNQueens() {
        int[][] board = new int[N][N];
        if (solveNQueensUtil(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("No sol.....");
        }
    }

    // Recursive utility function to solve the N-Queen problem
    private boolean solveNQueensUtil(int[][] board, int col) {
        // Base case: If all queens are placed, return true
        if (col >= N) {
            return true;
        }

       for (int row = 0; row <N; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 2;
            }

            if (solveNQueensUtil(board, col+1)) {
                return true;
            }
            board[row][col] = 0;
        }

        // If no queen can be placed in the current column, return false
        return false;
    }

    // Helper method to check if a queen can be placed in the given row and column
    private boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // Check if there is a queen in the same row on the left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the upper diagonal on the left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the lower diagonal on the left side
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Helper method to print the solution
    private void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the N-Queen problem solution
    public static void main(String[] args) {
        int N = 4;
        NQueenProblem nQueenProblem = new NQueenProblem(N);
        nQueenProblem.solveNQueens();
        
    }
}
