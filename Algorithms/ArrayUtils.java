package Algorithms;

public class ArrayUtils {
public void printArray(int arr[]) {
	int n=arr.length;
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public static void main(String[] args) {
	ArrayUtils arrayutils= new ArrayUtils();
	arrayutils.printArray(new int [] {34,45,67,13,80});
}
}
