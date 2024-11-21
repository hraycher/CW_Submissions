import java.util.Scanner; 
public class MonteHall {
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[]args) 
{

//basically a random door is picked which is 1.		
int winDoor = pickRandomDoor();
//the playerDoor is the door the player picks
int playerDoor = pickPlayerDoor();

System.out.println("You picked door number " + playerDoor);
//reveals the door that does not have the prize.
int revealedDoor=revealDoor(winDoor,playerDoor);
System.out.println( revealedDoor +" that door does not have a prize");
//basically if the player asked to swap his door then is final choice will be
//the door that did not reveal other wise is final choice will be the 
//first one he made.
int finalChoice=askToSwap(playerDoor, revealedDoor);

//if your final choice is equal to the winning door you win else you lose
//and it reveals the winning door to you.
if(finalChoice==winDoor) {
	System.out.print("Congradulations you win.");
}else {
	System.out.print("You lose the winning door was " + winDoor);
}

myReader.close();
}
//easy to explain randomly generates numbers 1,2,3.	
private static int pickRandomDoor()
{
	return((int)Math.random()*3)+1;
}

//This is easy to explain basicaly if your choice is less then one or more then
// three then you pick again but if you pick one of the three numbers it returns
//your choice.
private static int pickPlayerDoor() {
	System.out.print("Pick a number 1,2,3");
	int playerChoice=myReader.nextInt();
	if(playerChoice<1||playerChoice>3) {
		System.out.print("Pick numbers 1,2,or 3");
		playerChoice=myReader.nextInt();
	}
	return playerChoice;
}
//basically this just makes one the winning door since I don't know how to make
//it random so yea basically the winning door will always be one.
//also learned that the ? is a conditional operator return one of the values
//if its true or false.
private static int revealDoor(int winDoor, int playerDoor) {
	if(playerDoor==1) {
		return (winDoor==2)?3:2;
	} else if(playerDoor==2) {
		return (winDoor==1)?3:2;
	}else {
		return(winDoor==1)?2:1;
	}
}
//This part of the code allows you to swap your door if you say yes doesn't matter
//if its captial or lower case also why the 6-playerDoor-revealedDoor
//is because from a video I learned 1+2+3 add to six so lets say a player
//chooses door 3 and door 2 is revealed then door one is the corect answer
//if they decide to stay with there door then they stay with there door
private static int askToSwap(int playerDoor, int revealedDoor) {
	System.out.print("Do you want to swap doors yes or no");
	String swapChoice=myReader.next();
	if(swapChoice.equalsIgnoreCase("yes")) {
		return 6 - playerDoor - revealedDoor;
	}else {
		return playerDoor;
	}
}
}
	

