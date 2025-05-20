import java.util.Scanner;
public class maze {
	public static void main(String[]args) {
		//maze size will be 5x5
		int rows = 5;
		int colums = 5;
		
		//these will be the wall positions basically set by me manually
		boolean [][] isaWall=new boolean[5][5];
		isaWall [0][1]=true;
		isaWall [0][4]=true;
		isaWall [1][1]=true;
		isaWall [4][0]=true;
		isaWall [4][3]=true;
		isaWall [3][2]=true;
		isaWall [2][3]=true;
	
		//players star position
		int playerRow = 3;
		int playerColum = 3;
		
		//goal to reach to win or spot
		int goalRow = 0;
		int goalColum= 0;
		
		//Scanner for input, but also I used system.in something new I learn basically it allows the input from my keyboard and stores it 
		Scanner bla = new Scanner(System.in);
		
		boolean won=false;//check if the person made it to the spot
		while(!won) {
			//prints out maze with hidden tiles except the players
			System.out.println("maze");			
			int row=0;
			while (row<rows) {
				int colum=0;
				while(colum<colums) {
					//prints the letter p which indicates the players position on the maze				
					 if (row == playerRow && colum == playerColum) {
	                        System.out.print("[P]");
					 } else {
	                        System.out.print("[ ]");
	                    }
	                    colum++;
	                }
	                System.out.println();
	                row++;
	            }

            //ask the person where they would like to move
            System.out.println("up,down,left,right ");
            String move = bla.nextLine().toLowerCase(); // get the move input from the user

            // these will be the new positions
            int newRow = playerRow;
            int newColum = playerColum;

            // base on the person move this will be their position 
            if (move.equals("up")) {
                newRow = playerRow - 1;
            } else if (move.equals("down")) {
                newRow = playerRow + 1;
            } else if(move.equals("left")) {
                newColum = playerColum - 1;
            } else if (move.equals("right")) {
                newColum = playerColum + 1;
            } else {
                // if they don't put a direction thats not able them to move
                System.out.println("not a valid move");       
            }
            //check if the move is inside the maze
            if(newRow >= 0 && newRow < rows && newColum >= 0 && newColum < colums) {
            //checks if the new tile is a wall
            	if(isaWall[newRow][newColum]) {
            		System.out.println("Its a wall. Hahahaha");
            	}else {
            		//its not a wall so the player is able to move their
            		playerRow=newRow;
            		playerColum=newColum;
            	} 
            		
            	}else {
            		//if the player tries to go outside
            		System.out.println("can't escape the maze");
            		
            }
            //check if the player reach the goal or exit
            if(playerRow == goalRow && playerColum == goalColum) {
            	//tells you the maze is completed
            	System.out.println("maze completed:");
            	int r=0;
            	while(r<rows) {
                int c=0;
                while(c<colums) {
                	if(r==playerRow && c==playerColum) {
                		System.out.print("[p]");//show were the player ends
                	}else {
                		System.out.print("[]");//everything else is kept hidden
                	}
                	c++;
                }
                r++;
            	}
            	//this code just congratulates the player
            	System.out.println("Congradulations you escaped the maze");
            	won=true;
            }
		}
		bla.close();
	}
}
