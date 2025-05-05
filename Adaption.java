public class AdaptionMain {
	public static void main(String[]args) {
	//these two are the similar dog one	
	Dog Syril=new Dog(14,"Syrilisgay",false);
	Dog JAA=new Dog(14,"jew",false);
	//this right here is my dog and pup
	Dog SYY=new Dog(14,"jew",false);
	PuppyDog monkey=new PuppyDog(2,"monkey",false, false);
	//this here is basically my dog and pup stuff were you get age,if adopted,if fed and increase age
	System.out.println(Syril.getAdoptedStatus());
	System.out.println(monkey.getAdoptedStatus());
	Syril.stateAge();
	monkey.stateAge();
	Syril.increaseAge();
    monkey.increaseAge();
    Syril.stateAge();
    monkey.stateAge();
    System.out.println(Syril);
    System.out.println(monkey);
    System.out.println(Syril);
    System.out.println(monkey);
   //so for the same ones we are comepairing them together to see i they are equal to eachother.
    JAA.stateAge();
    SYY.stateAge();
  JAA.increaseAge();
  SYY.increaseAge();
    System.out.println(JAA);
    System.out.println(SYY);
    System.out.println(JAA.equals(SYY));
	}
}
