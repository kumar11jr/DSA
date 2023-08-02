import java.util.Scanner;
public class TicTacToe {
    public static void printboard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean hasWon(char[][] board, char player){
        // check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
        }

        return false;

    }
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }




        char player = 'X';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);



        while (!gameover) {
            printboard(board);
            System.out.println("Player " + player +" enter :(co-ordinates) ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row>=0 && row<=2 && col>=0 && col<=2) {
                if (board[row][col] == ' ') {
                board[row][col] = player;
                gameover = hasWon(board,player);
                if (gameover) {
                    printboard(board);
                    System.out.println("player " + player +" has won");
                }
                player = (player == 'X')? 'O':'X';
            }
            else{
                System.out.println("Invalid move");
            }
            }
            else{
                System.out.println("Invalid move");
            }
        }



    }
}