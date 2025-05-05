
public class Dog {
	//These codes right here gives the age name and if adopted for the dog and puppy
protected  int age = 0;
protected String name = "";
protected boolean Adopted;
//this is for the puppy in the super
public Dog(int a, String name, boolean ad) {
	age=a;
	this.name=name;
	Adopted=ad;
}
//This here returns if there adopted or not
public boolean getAdoptedStatus() {
	return Adopted;
}
//This code right here states the age
public void stateAge() {
	System.out.print(name+ " is " + age + " years old.");
}
//Well does what it says increases the age
public void increaseAge() {
	age++;
	
}
//This code right here states if the age of both dogs are equal they return true if not false.
public boolean equals(Dog doggy) {
	if(this.age==doggy.age && this.name==doggy.name && this.Adopted==doggy.Adopted) {
		return true;
	}
	return false;
}
}
