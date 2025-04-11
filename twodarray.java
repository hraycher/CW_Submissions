
public class twoDarray {

	    public static void main(String[] args) {
	        int[][] gridNums = new int[4][6]; // 4x6 array
	        int[][] arr = { // Predefined values
	            {4, 5, 7},
	            {2, -1, 8},
	            {0, 1, 3}
	        };

	        // Modifications
	        gridNums[0][0] = 17;
	        arr[0][0] = 17;
	        gridNums[1][2] = 20;
	        arr[1][2] = 20;
	        gridNums[0][gridNums[0].length - 1] = -5;
	        arr[0][arr[0].length - 1] = -5;
	        gridNums[gridNums.length - 1][0] = -7;
	        arr[arr.length - 1][0] = -7;
	        gridNums[gridNums.length - 1][gridNums[0].length - 1] = -30;
	        arr[arr.length - 1][arr[0].length - 1] = -30;

	        // Print arrays
	        System.out.println("gridNums:");
	        printArray(gridNums);
	        System.out.println("arr:");
	        printArray(arr);

	        // Additional methods
	        System.out.println("First row of arr:");
	        printRow(arr[0]);
	        System.out.println("First column of arr:");
	        printColumn(arr);
	    }

	    public static void printArray(int[][] array) {
	        for (int[] row : array) {
	            printRow(row);
	        }
	    }

	    public static void printRow(int[] row) {
	        for (int value : row) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void printColumn(int[][] array) {
	        for (int[] row : array) {
	            System.out.println(row[0]);
	        }
	    }
	}




