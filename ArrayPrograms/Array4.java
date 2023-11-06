package ArrayPrograms;

import java.util.Scanner;

//sorting an Array
public class Array4 {
public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter elements of the Array: ");
	for (int i = 0; i < 5; i++) {
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Unsorted Order of the Array:");
	for (int i = 0; i < 5; i++) {
		System.out.println(arr[i]+" ");
	}
	/*sorting procedure*/
	for (int i = 0; i < 5; i++) {
		for (int j = i+1; j < 5; j++) {
			if(arr[i]>arr[j]) {
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	System.out.println("\n\n Sorted Order of the Array(Increasing Order):");
for (int i = 0; i < 5; i++) {
	System.out.println(arr[i]+" ");
}
}
}