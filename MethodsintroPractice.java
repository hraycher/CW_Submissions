
public class Methods_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

sayName();
sayName();
printMathStuff(4);
printSumAints(1, 4);
printStateName();
printStateEyecolor();
printStateHairStyle();
printStateBestFriend();
printStateFavoriteFood();
printCircleStat(4.0);
}

	
	public static void sayName()

	{
		System.out.println("Hello my full name is Ha'aheonakpo'ihale");
		System.out.println();
	}
public static void printMathStuff(double x)
{
		System.out.print(x);
		x*=x;
		System.out.println("Square is "+x+".");
}

public static void printSumAints(int x, double y)
{
	int z =(int)y;
	System.out.println(x+z);
}
public static void printStateName()
{
	System.out.println("Ha'aheonakpo'ihale");
}
public static void printStateEyecolor()
{
	System.out.println("My eye color is brown");
	
}
public static void printStateHairStyle()
{
	System.out.println("messy");
}
public static void printStateBestFriend()
{
	System.out.println("every one");
}
public static void printStateFavoriteFood()
{
	System.out.println("Steak, ribs, chicken wings, pork chops");
}
public static void printCircleStat(double r)
{
	final double pie = 3.14159;
	double c = 2*pie*r;
	double d =r*2;
	double a =pie*r*r;
	System.out.println("The Radius of the circle is  "+ r + 
			" the circumpherence of the circle is  "+ c + " "
					+ "the diameter of the circle is "+d+ ""
							+ "the area of a circle is "+a+".");
}

}
