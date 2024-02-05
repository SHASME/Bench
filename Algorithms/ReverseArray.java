package Algorithms;

public class ReverseArray {
public static void reverse(int []number,int start, int end ) {
	while(start<end) {
		int temp = number[start];
		number[start]=number[end];
		number[end]=temp;
		start++;
		end--;
	}
}
public static void printArray(int []arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
}
public static void main(String[] args) {
	int[]number= {23,24,7,58,19,27};
	printArray(number);
	reverse(number,0,number.length-1);
	printArray(number);
	
}
}
