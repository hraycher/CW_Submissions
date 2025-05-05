
public class PuppyDog extends Dog{
//This code states if the pup is fed or not.
	boolean isFed=true;
	//basically the stuff from the dog just shortened to the super just with the isfed
	public PuppyDog(int a, String name, boolean ad,boolean f) {
		super(a,name,ad);
		isFed=f;
	}
	//states how old the puppy is when you write it in the main
	public void stateAge() {
		System.out.print(name+" is "+ age+ " months old");
	}
	//states whether the pup has been fed or not
	public void feedPup() {
		isFed=true;
	}
	//increases the age of the pup just like the dog but after this 
	public void increaseAge() {
	super.increaseAge();
	isFed=false;
		
	
	}
	//basically if fed is true it prints out im fed if not it prints out I must be fed
	public String toString() {
if(isFed) {
	return super.toString()+"I'm fed";
}
return super.toString()+"I must be fed";
	}
	//This code right here states if the age of both dogs are equal they return true if not false.
	public boolean equals(PuppyDog lilldoggy) {
		if(this.age==lilldoggy.age && this.name==lilldoggy.name && this.Adopted==lilldoggy.Adopted) {
			return true;
		}
		return false;
	}
}
