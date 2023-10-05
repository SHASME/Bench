import java.util.Arrays;

import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements in the Array: ");
	int n = sc.nextInt();
	int[] numbers = new int[n];
	System.out.println("Enter the elements of the Array");
    for (int i = 0; i < n; i++) {
    	numbers[i]=sc.nextInt();
	}
    int sum=0;
    for (int number : numbers) {
    	sum+=number;
    	
    }
	Arrays.sort(numbers);
	System.out.println("sum of the number in the array:" +sum);
	System.out.println("sorted array in ascending order: "+Arrays.toString(numbers));
    sc.close();
}
}
