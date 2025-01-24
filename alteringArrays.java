
public class AlteringArrayProblem {
public static void main (String[] args) {
	int [] nums= {5, 0, 8, 20};
	
}
public static int [] whatEver (int [] arr) {
	int [] copyArr = new int [arr.length];
	for (int i=0;i<arr.length;i++) {
	copyArr[i]-=5;
	}
	return arr;
}
}
