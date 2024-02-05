package Algorithms;

public class ResizeArray {
public void prinArray(int[]arr) {
	int n= arr.length;
	for (int i = 0; i < n; i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}
public int[] resize(int []arr , int capacity) {
	int[] temp = new int[capacity];
	for (int i = 0; i < arr.length; i++) {
		temp[i]=arr[i];
	}
	return temp;
}
public static void main(String[] args) {
	ResizeArray array= new ResizeArray();
	int[]original =new int[] {5,6,8,1,9};
	System.out.println("The size of original array -"+ original.length);
	original=array.resize(original,10);
	System.out.println("The size of an original array after resize -"+ original.length);
}
}
