/**
 * This here basically gives what and how I solved the square in the main method.
 */
public class Square {
//data attributes
	
	/*
	 * This is what I use to get the Area as well as the perimeter of the square as well.
	 */
	private int side;
//constructor
	
	/*
	 * gives the data attributes short wording.
	 */
	public Square (int s) {
		side=s;
		}
	//functionality
	
	/**
	 * This here gives the Area of each of
	 * the Squares in the main method and this is how its solved.
	 * @return
	 */
	public int getArea() {
		int Area=side*side;
		 return Area;
		
	}
	
	/**
	 * This here gives the perimeter of 
	 * each of the squares inside the main method and how its solved.
	 * @return
	 */
	public int getPerimeter() {
		int Perimeter=4*side;
		 return Perimeter;
	}
	
	/**
	 * This here gives what the shape is in the main method.
	 */
	public static String getShape() {
		return "The shapes are a Square";
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	}
