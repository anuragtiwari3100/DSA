import java.util.Scanner;

public class ToPrintOneSolution {
    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Horizontally in the same row
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Diagonally up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonally down
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            count++;
            return true;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    // Function call
                    return true;
                }
                board[row][j] = 'X'; // Backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------------- Chess Board -------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your chessboard: ");
        int n = sc.nextInt();
        System.out.print("Enter the initial row: ");
        int row = sc.nextInt();
        char board[][] = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        if (nQueens(board, row)) {
            System.out.println("Solution is possible:");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
        System.out.println("Number of solutions: " + count);
        sc.close();
    }
}
