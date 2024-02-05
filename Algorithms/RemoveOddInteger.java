package Algorithms;

public class RemoveOddInteger {
	public static void printArray(int [] arr) {
		int n =arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static int[] removeOdd(int []arr) {
	int evenCount=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] %2 == 0) {
			evenCount++;
		}
	}
	int []result = new int[evenCount] ;
	int idx=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				result[idx]=arr[i];
				idx++;
		}
	}
	return result;
	
}
public static void main(String[] args) {
	int[] arr = {3,4,5,6,8,19,24};
	printArray(arr);
	int []result=removeOdd(arr);
   printArray(result);
}
}
