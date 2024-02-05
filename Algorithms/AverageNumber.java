package Algorithms;

import java.util.Scanner;

public class AverageNumber {
public static void main(String[] args) {
	int a,b,c,sum;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Enter the Second number");
    b=sc.nextInt();
    System.out.println("Enter the third number");
    c=sc.nextInt();
    sum=a+b+c;
    double avg=sum/3;
    System.out.println("The average of the number is = " + avg);
}
}
