package Algorithms;

public class Palindrome {
public boolean isPalindrome(String word) {
	char[] charArray=word.toCharArray();
	int start = 0;
	int end = word.length() -1 ;
	
	while(start<end) {
		if(charArray[start] != charArray[end]) {
			return false;
		}
		start++;
		end --;
	}
	
	return true;
	
}
public static void main(String[] args) {
	Palindrome pal= new Palindrome();
	if(pal.isPalindrome("madam")) {
	System.out.println("The given string is palindrome !!!");
} else {
	System.out.println("The given string is not a palindrome");
}
}
}
