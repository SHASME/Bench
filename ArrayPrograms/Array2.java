package ArrayPrograms;

import java.util.Scanner;

//perctange Calculation using array
public class Array2 {
public static void main(String[] args) {
	int[] sub=new int[5];
	int total=0;
	float per;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 5 subjects:");
	for (int i = 0; i < 5; i++) {
		System.out.println("Enter marks for Subjects["+(i+1)+"]:");
		sub[i]=sc.nextInt();
	}
	for (int i = 0; i < 5; i++) {
		total=total+sub[i];
	}
	per=(float)total/5;
	System.out.println("Percentage:"+per);
	}
}

