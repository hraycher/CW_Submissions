import java.util.Scanner;
public class wordle {
public static void main(String[] args) {
	String word = "solo";// This is the word you need in order to win
	System.out.println("Want to play a game.");
    playGame(word);//play the game until you get the word correct.
}

public static void playGame(String word) {
	   Scanner gameReader = new Scanner(System.in);
      // the players guess is saved here
	   System.out.println("Make your choice all lowercase:");
       String playerGuess = gameReader.nextLine();
        //if the players guess is not = to 4 letters they have to try again.
		if(playerGuess.length()!=4) {
			System.out.print("Try again its four letters and lowercase get it right.");
		playGame(word);
		}
		else {//if the players guess = the word they win.
			if(playerGuess.equals(word)) {
				System.out.print("You got it right good job.");
			
			}
			else {//this right here lets you play again if you got the word wrong
				//and also the hints as well.
			    giveHintone(word,playerGuess);
			    giveHinttwo(word,playerGuess);
			    giveHintthree(word,playerGuess);
			    giveHintfour(word,playerGuess);
				System.out.print(" Try again");
				playGame(word);}
			}
			
		} //basically gives you the number one letter
public static void giveHintone(String word,String playerGuess) {
	if(word.charAt(0)==playerGuess.charAt(0)) {
	System.out.print("s");
	}else if(word.contains(String.valueOf(playerGuess.charAt(0)))){
		System.out.print("?");
	}else {
		System.out.print("X");
	}

}//basically gives you the number two letter
public static void giveHinttwo(String word,String playerGuess) {
	if(word.charAt(1)==playerGuess.charAt(1)) {
	System.out.print("o");
	}else if(word.contains(String.valueOf(playerGuess.charAt(1)))){
		System.out.print("?");
	}else {
		System.out.print("X");
	}

}//basically gives you the number three letter
public static void giveHintthree(String word,String playerGuess) {
	if(word.charAt(2)==playerGuess.charAt(2)) {
	System.out.print("l");
	}else if(word.contains(String.valueOf(playerGuess.charAt(2)))){
		System.out.print("?");
	}else {
		System.out.print("X");
}
}//basically gives you the number four letter
public static void giveHintfour(String word,String playerGuess) {
	if(word.charAt(3)==playerGuess.charAt(3)) {
	System.out.print("o");
	}else if(word.contains(String.valueOf(playerGuess.charAt(3)))){
		System.out.print("?");
	}else {
		System.out.print("X");
}
}
}
