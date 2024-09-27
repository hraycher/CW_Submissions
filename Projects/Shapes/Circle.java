public class Circle
{
// data attributes 
	private final double pie =3.14;
private	double radius;
	// constructor
	public Circle (double r) {
		radius=r;
	}
	// functionality
	
	/**
	 * This here gives the radius for each of the circles in the main method.
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * This here gives the Diameter for each of the circles in the main method.
	 * @return
	 */
	public double getDiameter()
	{
		double diameter=radius*2;
		return diameter;
	}
	
	/**
	 * This here gives the circumference for each of the circles in the main method.
	 */
	public double getCircumference()
	{
		final double pie = 3.14;
		double circumference = pie*radius*2;
	    return circumference;
	}
	
	/**
	 * This here gives the Area of each of the circle in the main
	 * and is also an example I used for the 5 other shapes.
	 * @return
	 */
	public double getArea()
	{
		double area=pie*radius*radius;
		return area;
	}
	
	/**
	 * This here is the example of the static string.
	 * @return
	 */
	public static String getShape()
{
		return "The shape is a circle";
}
	/**
	 * This turns everything about the object into a string.
	 */
	public String toString() {
	
		return "This is a circle with radius "+radius+" and an area of "+getArea()+" and circumference of "+ getCircumference() +".";
	}
	public void setRadius(double r){
		radius=r; 
	}
	
}
