
public class Algorithms {
	//returns the smallest number.
	public static int findSmallest (int[]arr) {
		int smallest = arr [0];// Assume the first element is the smallest
		   // Loop through the array to find the smallest number
		for(int i=0; i< arr.length ;i++) {
			if(arr[i] < smallest) {
				smallest=arr[i];// if the smallest number is found put it in
			}
			
		}
		return smallest;
	}
	  // 2. Return the index of the smallest number in the array
    public static int findSmallestnumber(int[] arr) {
        int smallest = arr[0]; // Start with the first element
        int index = 0; // Start with the index 0
        // Loop through the array to find the smallest number and its index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest number
                index = i; // Update index of smallest number
            }
        }
        return index; // Return the index of the smallest number
    }
    //3.find the average of all numbers
   public static double cAverage(int[]arr) {
	   double sum = 0;//the average starts at zero
	   //add each number in the array to get the sum
	   for(int i=0; i<arr.length; i++) {
		   sum += arr[i];
	   }
	   return sum/arr.length;//return the sum that is divided by the length of the array or amount of numbers
   }
   //4.return true if all numbers of the array are even
   public static boolean areAllEven(int[] arr) {
	   //find or loop to find if each number is even
	   for(int i=0; i<arr.length;i++) {
		   if(arr[i]%2 != 0) {
			   return false;//if all numbers aren't even return false.
		   }
		
	   }
	   return true;//if there all even return true
   }
   //5.If the array ever has two consecutive 5's, change them to 0's.
   public static void conFives(int[]arr) {
	   //loop through the array
	   for(int i=0; i<arr.length-1;i++) {
		   if(arr[i]==5 && arr[i+1]==5) {
			   arr[i]=0;//change the first 5 to 0
			   arr[i+1]=0;   // change the second 5 to 0
		   }
	   }
   }
   //6.Return true if any number shows up three times in a row, and return false otherwise. 
   public static boolean hasTripleconFives(int[]arr) {
	   for(int i = 0; i<arr.length-1;i++) {
		   if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
			   return true;
		   }
	   }
	   return false;
   }
   //7.Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. 
   public static int howManytimes0(int[]arr, int target) {
	   int count = 0;
	   for(int i=0; i<arr.length;i++) {
		   if(arr[i] == target) {
			   count++;
		   }
	   }
	   return count;
   }
   //8.Alter an array so that is the backwards version of the array initially passed
   public static void reverseArray(int[] arr) {
       int left = 0; // Start with the first
       int right = arr.length - 1; // Start with the last 
       // Loop until left and right meet
       while (left < right) {
           // Swap the elements at the left and right positions
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++; // Move left numbers right
           right--; // Move right numbers left
	   }
		   
	   }
   //9. Shift all elements in an array to the right.
	   public static void sRight(int[] arr) {
		   if (arr.length == 0) 
			   return;
		   int last = arr[arr.length-1];
		   for(int i = arr.length-1; i>0; i--) {
			   arr[i] = arr[i-1];
		   }
		   arr[0] = last;
   }
	   //10.Use either selection sort or insertion sort to sort an array.
	   public static void numberSort(int[] arr) {
		    // Loop through the array to find the smallest number in the unsorted part
		   for (int i=0; i<arr.length-1;i++) {
			   int temp = i;// Assume the current number is the smallest
			    // Find the smallest element in the unsorted part of the array
			   for (int j = i+1; j< arr.length;j++) {
				   if(arr[j]<arr[temp]) {
					   temp = j; // Update minIndex if a smaller number is found
				   }
			   }
			     // Swap the smallest element found with the current element
			   int tempTwo = arr[temp];
			   arr[temp] = arr[i];
			   arr[i] = tempTwo;
		   }
	   }
	   public static void main (String[]args) {
		int[] arr = {3, 9, 4, 7, 1, 6};
		   //find the smallest number
		 System.out.println(findSmallest(arr));
		   //find index of the smallest number
		 System.out.println(findSmallestnumber(arr));
		 //return the average
		 System.out.println(cAverage(arr));
		 //return true if all numbers are even
		 System.out.println(areAllEven(arr));
		 //if the array has two consecutive fives return zero
		 conFives(arr);
		 System.out.println(java.util.Arrays.toString(arr));
		 //Return true if any number shows up three times in a row, and return false otherwise. 
		 System.out.println(hasTripleconFives(arr));
		 //Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array.
		 System.out.print(howManytimes0(arr, 4));
		 //Alter an array so that is the backwards version of the array initially passed
		 reverseArray(arr);
		 System.out.println(java.util.Arrays.toString(arr));
		 //Shift all elements in an array to the right
		 sRight(arr);
		 System.out.println(java.util.Arrays.toString(arr));
		 // Use either selection sort or insertion sort to sort an array
		 numberSort(arr);
		 System.out.println(java.util.Arrays.toString(arr));
		 
		 
		   
		   
		   
	   }
}
