
public class Month {
	public static void main(String[]args) {
		/**
		 * were you put the n input to get the month you put.
		 */
		System.out.print(getMonth(1));
	}
	public static String getMonth(int n) {
		/**
		 * This part right here has all the names of the month.
		 */
		String month = "January February March April May June "+"July August September Ocober November December ";
	   /**
	    * Basically gives what its equal if n is 11 it will go through all of them until it hits 
	    * 11.
	    */
		for (int i=1; i<=12; i++) {
	    	/**
	    	 * looks for the index of space between the months.
	    	 */
			int sL = month.indexOf(" ");
	    	/**
	    	 * n is the input the programmer puts.
	    	 */
			if (n == i) {
	    		/**
	    		 * basically returns the zero charAt of the month 
	    		 * and the space location of it as well.
	    		 */
				return month.substring(0, sL);
	    	}else {
	    		/**
	    		 * if the code is less then one or more then 12 then it will return nothing.
	    		 */
	    		month = month.substring(sL+1);
	    	}
	    }
	    return month;
}
}
