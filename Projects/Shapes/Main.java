
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * This gives the radius of circle one, two, and three and gives the diameter
 * circumference and area of circle of all three as well.This is also the example I used
 * to get my five other shapes as well.
 */
	 Circle cirOne=new Circle(3.0);
	 Circle cirTwo=new Circle(20.0);
	 Circle cirThree=new Circle(-4.0);
	 System.out.println(cirOne.getRadius());
	 System.out.println(cirTwo.getRadius());
     System.out.println(cirThree.getRadius());
     System.out.println(cirOne.getDiameter());
     System.out.println(cirOne.getCircumference());
     System.out.println(cirOne.getArea());
     System.out.println(cirTwo.getDiameter());
     System.out.println(cirTwo.getCircumference());
     System.out.println(Circle.getShape());
	/*
	 * I'm testing the three square object with different sides and I'm testing them
	 * to see the Area and Perimeter I get from all three of them then later I give what shape 
	 * they are.
	 */
     
     
     
     Square squOne=new Square(4);
	 Square squTwo=new Square(7);
	 Square squThree=new Square(-5);
	 System.out.println(squOne.getArea());
	 System.out.println(squTwo.getArea());
	 System.out.println(squThree.getArea());
	 System.out.println(squOne.getPerimeter());
	 System.out.println(squTwo.getPerimeter());
	 System.out.println(squThree.getPerimeter());
	 System.out.println(Square.getShape());
	/*
	 *I have three rectangles with different lengths and widths
	 *and I have the Area of the Rectangle as well as the Perimeter of the Rectangle.
	 */
	 
	 Rectangle recOne=new Rectangle(4, 3);
	 Rectangle recTwo=new Rectangle(5, 7);
	 Rectangle recThree=new Rectangle(-7, 9);
	 System.out.println(recOne.getArea());
	 System.out.println(recTwo.getArea());
	 System.out.println(recThree.getArea());
	 System.out.println(recOne.getPerimeter());
	 System.out.println(recTwo.getPerimeter());
	 System.out.println(recThree.getPerimeter());
	 System.out.println(Rectangle.getShape());
	 Rectangle recFour=new Rectangle (3,7);
	 Rectangle recFive=new Rectangle (4);
	/*
	 * I have three Rhombus with up and down angles different from each other
	 * and for all three of them I have the Area as well as the Perimeter of it as well.
	 */
	 
	 Rhombus rhoOne=new Rhombus(5, 2);
	 Rhombus rhoTwo=new Rhombus(4, 6);
	 Rhombus rhoThree=new Rhombus(9, -2);
	 System.out.println(rhoOne.getArea());
	 System.out.println(rhoTwo.getArea());
	 System.out.println(rhoThree.getArea());
	 System.out.println(rhoOne.getPerimeter());
	 System.out.println(rhoTwo.getPerimeter());
	 System.out.println(rhoThree.getPerimeter());
	 System.out.println(Rhombus.getShape());
	/*
	 * I have three different Right Triangles with different leg a and different leg b
	 * and later for all three of them I have the Area as well as the Perimeter and the
	 * Hypotenuse of the triangles as well.
	 */
	 
	 RightTriangle rtrOne=new RightTriangle(5,6);
	RightTriangle rtrTwo=new RightTriangle(3,7);
	RightTriangle rtrThree=new RightTriangle(-5,8);
	 System.out.println(rtrOne.getArea());
	 System.out.println(rtrTwo.getArea());
	 System.out.println(rtrThree.getArea());
	 System.out.println(rtrOne.getPerimeter());
	 System.out.println(rtrTwo.getPerimeter());
	 System.out.println(rtrThree.getPerimeter());
	 System.out.println(rtrOne.getHypotenuse());
	 System.out.println(rtrTwo.getHypotenuse());
	 System.out.println(rtrThree.getHypotenuse());
	 System.out.println(RightTriangle.getShape());
	/*
	 * I have three different Trapezoids and with the setting I have calculated the
	 * Area of the three Trapezoid as well as the Perimeter.
	 */
	 
	 Trapezoid traOne=new Trapezoid(5,4,3,7,8);
	 Trapezoid traTwo=new Trapezoid(6,1,8,2,4);
	 Trapezoid traThree=new Trapezoid(7,1,-2,4,-9);
	 System.out.println(traOne.getArea());
	 System.out.println(traTwo.getArea());
	 System.out.println(traThree.getArea());
	 System.out.println(traOne.getPerimeter());
	 System.out.println(traTwo.getPerimeter());
	 System.out.println(traThree.getPerimeter());
	 System.out.println(Trapezoid.getShape());
	
	/**
	 * This is what we did in class today 9/25/24.
	 */
	System.out.println(cirOne.toString());
	System.out.println(cirTwo);
	System.out.print(cirThree);
	}

}
