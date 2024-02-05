package Algorithms;

public class MissingNumber {
public static int findMissingNumber(int[] arr) {
	int n =arr.length + 1;
	int sum = n * (n+1) /2;
	for (int num : arr) {
		sum=sum-num;
	}
	return sum;
}
public void arrayDemo() {
	int arr[]= {1,3,8,2,4,7,5,9};
	System.out.println(findMissingNumber (arr));
}
public static void main(String[] args) {
	MissingNumber missing= new MissingNumber();
	missing.arrayDemo();
}
}
