package Algorithms;

public class ArrayUtil {
public void printArray(int[] arr) {
	int n = arr.length;
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" " );
	}
	System.out.println();
}
public void arrayDemo() {
	int [] myArray = new int[5];
	myArray[0]=3;
	myArray[1]=3;
	myArray[2]=23;
	myArray[3]=10;
	myArray[4]=4;
	myArray[4]=21;
	printArray(myArray);
	System.out.println(myArray.length);
	System.out.println(myArray[myArray.length - 1]);
    int arr[]= {4,4,5,6,5};
    printArray(arr);
}
public static void main(String[] args) {
	ArrayUtil arrayUtil = new ArrayUtil();
	arrayUtil.arrayDemo();
}
}
