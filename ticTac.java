import java.util.Scanner;
public class testerThree {
	  // Function to print the Tic-Tac-Toe grid
    public static void printGrid(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    // Function to check if a player has won
    public static boolean checkWIN(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        
        return false;
    }

    // Function to check if the board is full (tie condition)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Main function to play the game
    public static void playG() {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char[] players = {'X', 'O'};
        int currentPlayer = 0; // Start with player X
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (true) {
            printGrid(board);

            // Ask the current player for their move
            System.out.println("Player " + players[currentPlayer] + " turn");
            System.out.print("Enter the row (0, 1, 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter the column (0, 1, 2): ");
            int col = scanner.nextInt();

            // Check if the chosen cell is empty
            if (board[row][col] != ' ') {
                System.out.println("That spot is already taken, Try again.");
                continue;
            }

            // Place the player's mark
            board[row][col] = players[currentPlayer];

            // Check if the current player won
            if (checkWIN(board, players[currentPlayer])) {
                printGrid(board);
                System.out.println("Player " + players[currentPlayer] + " wins!!!!YAA");
                break;
            }

            // Check if the game is a tie
            if (isBoardFull(board)) {
                printGrid(board);
                System.out.println("It's a tie BOOOO");
                break;
            }

            // Switch to the next player
            currentPlayer = 1 - currentPlayer;  // Switch between 0 and 1
        }

        scanner.close();
    }

    public static void main(String[] args) {
        playG();
    }
}
