package ArrayPrograms;

import java.util.Scanner;

//Taking to input from user
public class Array1 {
public static void main(String[] args) {
	//int arr[]= {10,20,30,40,50,60};
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Elements of the Array -");
	for (int i = 0; i < 5; i++) {
		System.out.println("Enter the value of arr["+i+"]-");
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Content of the Array -");
	for (int i = 0; i < 5; i++) {
		System.out.println("Value at arr["+i+"]is"+arr[i]);
	}
}
}
