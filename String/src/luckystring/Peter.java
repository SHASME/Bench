package luckystring;

import java.util.Scanner;

public class Peter {
 static int n1,n2,n3;
 public static void main(String[] args) {
	
	 Scanner  sc = new Scanner(System.in);
	 System.out.println("Enter String");
	 String s1 =sc.next();
	 int N1,N2,N3;
	 char array[]=s1.toCharArray();
	 
	for (int i = 0; i < array.length; i++) {
		if(array[i] == array[i+1]&& array[i] !='\n') {
			n1++;
			array[i]='\n';
		}
		else {
			break;
		}
	}
	N1=n1+1;
	
	for (int i = 0; i < array.length; i++) {
		if(array[i] == array[i+1]&& array[i] !='\n') {
			n2++;
			array[i]='\n';
	}
		else {
			break;
		}
		}
	N2 = n2+1;
	
	for (int i = 0; i < array.length; i++) {
		if(array[i] == array[i+1]&& array[i] !='\n') {
			n3++;
			array[i]='\n';
		}
		else {
			break;
		}
}
	N3 =n3+1;
	
	if(N1 == N2 && N1 == N3 && N2 == N3)
		System.out.println("YES");
	else
		System.out.println("NO");
}
}