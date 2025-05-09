public class twoDarray {

	    public static void main(String[] args) {
	        
	        // 1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
	        int[][] gridNums = new int[4][6];

	        // Printing out the gridNums before any modifications
	        print2DArray(gridNums);
	        
	        // 2. Instantiate a 2-D array with the following values:
	        int[][] arr = {
	            {4, 5, 7},
	            {2, -1, 8},
	            {0, 1, 3}
	        };

	        // Printing out the array before any modifications
	        print2DArray(arr);
	        
	        // 3. For both of those arrays, change the element in the first row, first column to a 17.
	      System.out.print("");
	        gridNums[0][0] = 17;
	        arr[0][0] = 17;
	        
	        // Printing out the arrays after the change
	        print2DArray(gridNums);
	        print2DArray(arr);
	        
	        // 4. For both of those arrays, change the element in the second row, third column into a 20. 
	        gridNums[1][2] = 20;
	        arr[1][2] = 20;

	        // Printing out the arrays after the change
	        print2DArray(gridNums);
	        print2DArray(arr);
	        
	        // 5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
	        gridNums[0][gridNums[0].length - 1] = -5;
	        arr[0][arr[0].length - 1] = -5;

	        // Printing out the arrays after the change
	        print2DArray(gridNums);
	        print2DArray(arr);
	        
	        // 6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
	        gridNums[gridNums.length - 1][0] = -7;
	        arr[arr.length - 1][0] = -7;

	        // Printing out the arrays after the change
	        print2DArray(gridNums);
	        print2DArray(arr);
	        
	        // 7.  For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
	        gridNums[gridNums.length - 1][gridNums[gridNums.length - 1].length - 1] = -30;
	        arr[arr.length - 1][arr[arr.length - 1].length - 1] = -30;

	        // Printing out the arrays after the change
	        print2DArray(gridNums);
	        print2DArray(arr);
	        
	        // 8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	        printFirstRow(arr);

	        // 9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	        printFirstColumn(arr);

	        // 10.  Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	        printRowMajorOrder(arr);

	        // 11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	        printColumnMajorOrder(arr);
	    }

	    // Printing out the gridNums before any modifications
	    public static void print2DArray(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // print each element in the first row
	    public static void printFirstRow(int[][] array) {
	        for (int j = 0; j < array[0].length; j++) {
	            System.out.print(array[0][j] + " ");
	        }
	        System.out.println();
	    }

	    // print each element in the first column
	    public static void printFirstColumn(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i][0]);
	        }
	    }

	    // print elements in row order
	    public static void printRowMajorOrder(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // print elements in column order
	    public static void printColumnMajorOrder(int[][] array) {
	        for (int j = 0; j < array[0].length; j++) {
	            for (int i = 0; i < array.length; i++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

