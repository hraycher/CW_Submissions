/**
 * This here basically gives what and how I solved the Trapezoid in the main method.
 */
public class Trapezoid {
	//data attributes
	/*
	 * This here is how I got the Area as well as the Perimeter of the trapezoid.
	 */
	private double bassa;
	 private double bassb;
	  private double bassc;
	   private double bassd;
	    private double height;
	    
	//constructor
	    /*
	     * gives the data attributes short wording.
	     */
	   public Trapezoid(double a, double b, double c, double d, double h)
	   {
		   bassa=a;
		    bassb=b;
		     bassc=c;
		      bassd=d;
		       height=h;
	  }
	   //functionality

/**
 * This here gives the Area for all three of the Trapezoids
 * in the Main method and this is how they are solved.
 * @return
 */
    public double getArea() {
    	double Area=((bassa+bassb)/2)*height;
    	 return Area;
    }
    
    /**
     * This here gives the Perimeter for all three of the Trapezoids
     * in the main methd and this is how its solved.
     * @return
     */
    public double getPerimeter() {
    	double Perimeter=(bassa+bassb+bassc+bassd);
    	 return Perimeter;
    }
    
    /**
     * This here just says what the shape is in the main method.
     * @return
     */
    public static String getShape() {
    	return "The shapes are a Trapezoid";
    }
}

