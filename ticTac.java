import java.util.Scanner;
public class tictactoe {
	    // Prints the basically the tic tac board
public static void printBoard(char[][] theBoard) {
for (int i = 0; i < 3; i++) { // just row
for (int j = 0; j < 3; j++) { //colum row
         System.out.print(theBoard[i][j]); // Print the current cell's value 
            if (j < 2) {
               System.out.print(" | "); // adds the vertical colum for the board
	                }
	            }
              System.out.println(); // Move to the next line after a row is printed
          if (i < 2) {
	                System.out.println("---------"); // Adds the horazontal colum for the board
	            }
	        }
	    }
//check if a player won
public static boolean didWin(char [][] board, char whichPlayer) {
	//checks the rows and colums
	for(int i=0; i<3; i++) {
		   // check if all spots in the current row are the players letter
		if(board[i][0] == whichPlayer && board[i][1] == whichPlayer && board[i][2] == whichPlayer) {
			return true;//row win
}
		 // check if all spots in the current column are the players letter
        if (board[0][i] == whichPlayer && board[1][i] == whichPlayer && board[2][i] == whichPlayer) {
            return true; // column win
}
}
        // Check both diagonals
        if (board[0][0] == whichPlayer && board[1][1] == whichPlayer && board[2][2] == whichPlayer) {
            return true; // top left to bottom right diagonal win
}
        if (board[0][2] == whichPlayer && board[1][1] == whichPlayer && board[2][0] == whichPlayer) {
            return true; // top right to bottom left diagonal win
}
        // No win condition met
        return false;
}
//Checks if the board is full and there are no empty spots left
public static boolean tieCheck(char[][] gameBoard) {
	 for (int i = 0; i < 3; i++) { // go through each row
		 for (int j = 0; j < 3; j++) { // go through each column
			    if (gameBoard[i][j] == ' ') {
			    	 return false; // an empty space so not a tie
			    }
		 }
	 }
	 return true; // no empty spaces found its a tie
}
//game loop and logic
public static void startPlaying() {
    // makes the tic tac toe board empty
	   char[][] grid = {
	            {' ', ' ', ' '},
	            {' ', ' ', ' '},
	            {' ', ' ', ' '}
	        };
	   // basically these are what the players are going to use
       char[] players = {'X', 'O'};
       int whosTurn = 0; // basically the turns and keeps track of it
       Scanner input = new Scanner(System.in); //user input
        boolean gameOver = false; // keep the game running
     // game loop continues until someone wins or it's a tie
        while (!gameOver) {
        	 printBoard(grid); // shows the current board
        	 int r = -1, c = -1; // Variables to hold row and column input
             boolean validMove = false; // Flag to ensure valid move is made
              // Loop until a valid move is entered
             while (!validMove) {
            	 System.out.println("Go Player " + players[whosTurn]);
                 System.out.print("Row? (0-2): ");
                 r = input.nextInt(); // gets the  row number
                 System.out.print("Col? (0-2): ");
                 c = input.nextInt(); //gets the column number
               //checks if its actually a spot
                 if (r >= 0 && r < 3 && c >= 0 && c < 3) {
                     validMove = true; // Valid move
                 } else {
                     System.out.println("pick a different spot"); // Invalid move
                 }
             }

             // places the players letters on the board
             grid[r][c] = players[whosTurn];

             // checks if the current player has won
             if (didWin(grid, players[whosTurn])) {
                 printBoard(grid); // shows the board
                 System.out.println("whoever player " + players[whosTurn] + " is you won ");
                 gameOver = true; // ends the game
             }
             // checks if the game is a tie
             else if (tieCheck(grid)) {
                 printBoard(grid); // show final board
                 System.out.println("ooh no its a tie");
                 gameOver = true; // ends the game
             }
             // if there is no win or tie switch to the next
             else {
                 whosTurn = 1 - whosTurn; //basically begins the other persons turn
             }
         }
        input.close(); // closes the input ]
        }
// This is were the game begins
public static void main(String[] args) {
    startPlaying(); // starts the game when program runs
    }
}   
        



