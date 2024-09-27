/**
 * This here basically gives what and how I solved the Rectangle in the main method
 */
public class Rectangle {
//data attributes
	
	/*
	 * This are the stuff i use to get the Area and perimeter
	 */
	private int length;
	 private int width;
//constructor
	 /*
	  * gives the data attributes short wording.
	  */
	 public Rectangle (int w, int l) {
		 length=l;
		 width=w;
		 
		 }
	 public Rectangle (int s) {
		 length=s;
		 width=s;
	 }
	
	//functionality
	 
	 /**
	  * This here functionality gives the Area for each
	  * of the three Rectangles in the main method.
	  * @return
	  */
    public int getArea() {
    	int Area=length*width;
    	 return Area;
    }
    
    /**
     * This here functionality gives the Perimeter of each of the  three Rectangles 
     * in the main method
     * @return
     */
    public int getPerimeter() {
    int Perimeter=2*(length+width);
    return Perimeter;
    }
    
    /** 
     * This here is the only static string 
     * and in the main method gives the shape of it.
     * @return
     */
    public static String getShape() {
    	return "The shapes are a Rectange";
    }
	 }
