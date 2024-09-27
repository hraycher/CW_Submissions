/**
 * This here basically gives what and how I solved the Rhombus in the main methpd.
 */
public class Rhombus {
//data attributes
	/*
	 * Gives the angle that will be used in the Area and Perimeter.
	 */
	private int up;
	private int down;
	//constructor
	
	/*
	 * Gives the short letter to the data attributes.
	 */
	public Rhombus (int u, int d) {
	up=u;
	 down=d;
		
	}
	//Functionality
	
	
/**
 * This functionality here gives the Area for all three
 * of the Rhombus inside of the main method.
 * @return
 */
	public int getArea() {
		int Area=((up*down)/2);
		 return Area;
	}
	
	/**
	 * This Functionality give the Perimeter of 
	 * all three of the Rhombus that are in the main method.
	 * @return
	 */
	public int getPerimeter() {
		int Perimeter=((up*down)/2)*4;
		 return Perimeter;
	}
	
	/**
	 * This functionality give the shape of the rhombus in
	 * the main method and is the only static string method.
	 * @return
	 */
	public static String getShape() {
		return "The shapes are a Rhombus";
	}
}
