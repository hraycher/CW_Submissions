import java.util.ArrayList;

public class arrayLt {
	//1.Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	public static int checkFor4(ArrayList<Integer> arr) {
	for(int i=0;i<arr.size();i++) {
		if(arr.get(i)==4) {
			return i;
		}
	}
	return -1;
	}
	public static void ridAll5(ArrayList<Integer> list) {
		 for (int i = list.size() - 1; i >= 0; i--) {
	            if (list.get(i) == 5) {
	                list.remove(i);
	                
	}
		 }
	}
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums){
		int n = nums.size();
		for(int i=0; i<n - 1; i++) {
			for(int j=0; j<n - i- 1; j++) {
				if(nums.get(j)> nums.get(j+1)){
					int temp = nums.get(j);
					nums.set(j,  nums.get(j+1));
					nums.set(j+1, temp);
				}
			}
		}
			return nums;
		}
	
		 public static void main(String[] args) {
			 ArrayList<Integer>arr = new ArrayList<>();
			 arr.add(4);
			 arr.add(5);
			 arr.add(4);
			 arr.add(6);
			 arr.add(9);
			 arr.add(7);
			 System.out.println(checkFor4(arr));
		 ArrayList<Integer>list = new ArrayList<>();
		 list.add(5);
		 list.add(6);
		 list.add(3);
		 list.add(5);
		 list.add(1);
		 list.add(5);
		 System.out.println(list);
		 ArrayList<Integer>nums = new ArrayList<>();
		 list.add(5); 
		 list.add(4);
		 list.add(3);
		 list.add(1);
		 list.add(9);
		 System.out.println(nums);
		 }
		 
		 }
