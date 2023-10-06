package BackTracking;

public class N_queens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            printSolution(board); // base condition
            return;
        }
        // placeing the each queens in column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                // backtrack
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int column) {
        // Check the same column
        for (int i = 0; i < row; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // Check the diagonal left up
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the diagonal right up
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // It's safe to place a queen here
    }

    private static void printSolution(char[][] board) {
        System.out.println("----------Board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
    }
}
