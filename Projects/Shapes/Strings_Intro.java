import java.util.Scanner;
public class StringsIntro {
	
	public static void main(String[] args) {	
	// I created a scanner so people can write in the console area.	
	Scanner myReader = new Scanner(System.in);
	
	System.out.println("Put your word here: ");
	String myInput = new String(myReader.next());
		
//* this here is all my stuff were I get the first three and last three letter 
// as well as the location of the E if there is an e and also the second and last letter as well
		myReader.close();
		
		System.out.println("You typed in this word: " + myInput);
		
		printSecondAndLastLetter(myInput);
		
		findTheEThatReturns(myInput);
		
		getLength(myInput);
		
		getFirstAndLastThreeLetters(myInput);
	}
	// This here I used charAt and charAt length to get my second and last letter
	public static void printSecondAndLastLetter( String myImput )
	{
		System.out.print("Second and Last Letter:");
		 System.out.print(myImput.charAt(1));
		  System.out.println(myImput.charAt(myImput.length()-1));

	}
	// Here I used the indexOf to get the location of e if there is none it will 
	// be negative one
	public static void findTheEThatReturns(String myImput)
	{
		System.out.print("The E in the Word:");
		 System.out.println(myImput.indexOf("e"));
	}
	//This here tells you how many letters are in the word.
	public static void getLength(String myImput)
	{
		System.out.print("How many words:");
		 System.out.println(myImput.length());
	}
	//I used the substring to get the first three letters
	//Then I used the charAt length to get the last three letters
	public static void getFirstAndLastThreeLetters(String myImput)
	{
		System.out.print("The First Three Letters:");
		 System.out.println(myImput.substring(0,3));
		  System.out.print("The Last Three Letter:");
		   System.out.print(myImput.charAt(myImput.length()-3));
		    System.out.print(myImput.charAt(myImput.length()-2));
		     System.out.print(myImput.charAt(myImput.length()-1));
	}
	

}
