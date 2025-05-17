import java.util.Scanner; // allows us to take input from the user

public class maze {
    public static void main(String[] args) {
        int rows = 5; // total number of rows in the maze
        int columns = 5; // total number of columns in the maze

        // 2D array to mark where the walls are in the maze
        boolean[][] isaWall = new boolean[5][5];
        isaWall[0][1] = true;
        isaWall[0][4] = true;
        isaWall[1][1] = true;
        isaWall[4][0] = true;
        isaWall[4][3] = true;
        isaWall[3][2] = true;
        isaWall[2][3] = true;

        // Starting position of the player
        int playerRow = 3;
        int playerColum = 3;

        // Ending position (goal)
        int goalRow = 0;
        int goalColum = 0;

        Scanner scanner = new Scanner(System.in); // to read input from the keyboard
        boolean won = false; // to track if the player has reached the goal

        // Main game loop - repeats until the player wins
        while (!won) {
            System.out.println("Maze:");
            
            // Print the maze grid
            int row = 0;
            while (row < rows) {
                int col = 0;
                while (col < columns) {
                    // Show the player's current position
                    if (row == playerRow && col == playerColum) {
                        System.out.print("[P]");
                    } else {
                        // Everything else is hidden
                        System.out.print("[ ]");
                    }
                    col++; // move to the next column
                }
                System.out.println(); // go to the next line after each row
                row++; // move to the next row
            }

            // Ask the player for their next move
            System.out.println("Move (up/down/left/right): ");
            String move = scanner.nextLine().toLowerCase(); // get the move input from the user

            // These will be the new position values
            int newRow = playerRow;
            int newCol = playerColum;

            // Adjust the position based on the move
            if (move.equals("up")) {
                newRow = playerRow - 1;
            } else if (move.equals("down")) {
                newRow = playerRow + 1;
            } else if (move.equals("left")) {
                newCol = playerColum - 1;
            } else if (move.equals("right")) {
                newCol = playerColum + 1;
            } else {
                // If the input is not a valid direction
                System.out.println("Invalid move. Try again.");
                continue; // skip the rest of the loop and ask again
            }

            // Check if the new position is within the maze
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                // Check if the new tile is a wall
                if (isaWall[newRow][newCol]) {
                    System.out.println("That's a wall! You can't go there.");
                } else {
                    // It's not a wall, so move the player
                    playerRow = newRow;
                    playerColum = newCol;
                }
            } else {
                // Player tried to move outside the maze
                System.out.println("You can't move outside the maze!");
            }

            // Check if the player has reached the goal
            if (playerRow == goalRow && playerColum == goalColum) {
                // Show the final maze one last time
                System.out.println("Maze completed:");
                int r = 0;
                while (r < rows) {
                int c = 0;
                while (c < columns) {
                if (r == playerRow && c == playerColum) {
                 System.out.print("[P]"); // show where the player ended
                        } else {
                            System.out.print("[]"); // keep everything else hidden
                        }
                        c++;
                    }
                    System.out.println();
                    r++;
                }

                // Congratulate the player
                System.out.println("Congratulations! You reached the end.");
                won = true; // stop the loop
            }
        }

        scanner.close(); // clean up the scanner after the game ends
    }
}
