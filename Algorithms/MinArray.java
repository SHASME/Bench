package Algorithms;

public class MinArray {
public int findMinimum(int[]arr) {
	if(arr==null || arr.length==0) {
		throw new IllegalArgumentException("Invalid Input");
	}
	int min=arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
public static void main(String[] args) {
	int []arr = {40,60,38,16,34,13};
	MinArray ma = new MinArray(); //initialization
	System.out.println(ma.findMinimum(arr));
	
//	IllegalArgumentExceptions -
//	System.out.println(ma.findMinimum(new int[0]));
//	System.out.println(ma.findMinimum(null));
}
}
