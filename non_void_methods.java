public class Non_void_Method_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StateName());
System.out.println(StateHairColor());
System.out.println(StateEyeColor());
System.out.println(BestFriend());
System.out.println(FavoriteFood());
double radius = 2;
System.out.println(diameter(radius));
System.out.println(circumpherence(radius));
System.out.println(area(radius));
int addNum = 2;
System.out.println(MathStuff(addNum));

	}

	
	public static String StateName()
	{
		return ("My name is Ha'aheo");
	}
	public static String StateHairColor()
	{
		return ("My hair color is brown");
	}
	public static String StateEyeColor()
	{
		return ("My eye color is brown.");
	}
	public static String BestFriend()
	{
		return ("My best friend is everyone");
	}
	public static String FavoriteFood()
	{
		return("My favorite food is chicken, steak, ribs, and pork chop");
	}
	public static double diameter(double radius)
	{
		double d = radius*2;
		return d;
	}
	public static double circumpherence(double radius)
	{
	final double pie=3.14159;
	double circumference = 2*pie*radius;
	return circumference;
	}
	public static double area(double radius)
	{
		final double pie=3.14159;
		double area = pie*radius*radius;
		return area;
		
	}
	public static double MathStuff(int addNum)
	{
		double Equal = addNum*2;
		double finish = 4*Equal;
		return finish;
		
		
	}
}
