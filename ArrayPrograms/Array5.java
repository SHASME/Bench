package ArrayPrograms;

import java.util.Scanner;

public class Array5 {
public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter elements of the Array: ");
	for (int i = 0; i < 5; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Unsorted Order of the Array: ");
	for (int i = 0; i < 5; i++) {
		System.out.println(arr[i]+" ");
	}
	for (int i = 0; i < 5; i++) {
	for (int j = i+1; j <5; j++) {
		if(arr[i]<arr[j]) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	}	
	}
	System.out.println("\n\nSorted Order of the Array(Decreasing Order): ");
	for (int i = 0; i <5; i++) {
		System.out.print(arr[i]+"  ");
	}
}
}
