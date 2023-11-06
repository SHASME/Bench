package ArrayPrograms;

import java.util.Scanner;

//Array in Reverse Order
public class Array3 {
public static void main(String[] args) {
	int arr[]=new int[5];
	int i;
	
	Scanner sc=new 	Scanner(System.in);
	System.out.println("Enter Elements of the Arry -");
     for (int j = 0; j <5; j++) {
	arr[j]=sc.nextInt();
     }
     System.out.println("\n Content of the Array -");
     for (int j= 0; j<5; j++) {
	System.out.println(arr[j]);	
	}
     System.out.println("\n Content of the Array -");
     for (int j = 4; j >=0; j--) {
	System.out.println(arr[j]);	
	}
}	
}

