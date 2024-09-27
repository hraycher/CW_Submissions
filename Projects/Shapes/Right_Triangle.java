/**
 * This here basically gives what and how I solved the Rigth Triangle in the main method.
 */
public class RightTriangle {
	//data Attributes
	/*
	 * This is what i used to get the Area, perimeter, and Hypotenuse of the Right Triangle.
	 */
	private double lega;
	 private double legb;
	//constructor
	 
	/*
	 *  gives the data attributes short wording.
	 */
	 public RightTriangle (double a, double b) {
		 lega=a;
		 legb=b;
	 }
	 //functionality
	
	 /**
	  * This here give the Area for all three of the Right Triangles
	  * inside of the main method and this is how its solved.
	  * @return
	  */
	 public double getArea() {
		 double Area=((lega*legb)/2);
		  return Area;
	 }
	
	 /**
	  * This here gives the perimeter of all three of the Right Triangles 
	  * in the main method and this is how its solved.
	  * @return
	  */
	 public double getPerimeter() {
		 double Perimeter=lega+legb+(Math.sqrt(lega*lega+legb*legb));
		  return Perimeter;
		  }
	 
	 /**
	  * This here give the Hypotenuse of each of the right triangles 
	  * in the main method and this here is how you solve it.
	  * @return
	  */
     public double getHypotenuse() {
    	 double Hypotenuse=(Math.sqrt(lega*lega+legb*legb));
    	 return Hypotenuse;
     }
     
     /**
      * This is the only static string and basicaly says what the shape is.
      * @return
      */
     public static String getShape() {
    	 return "The shapes are a  Right Triangle";
     }
}
