package palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
	
	String res=	PalindromeApp.palindrome(s1);
	System.out.println(res);
	if(s1.equals(res))
	{
		System.out.println(s1+"is a palindrome string");
	}
	else
	{
		System.out.println(s1+"is not a palindrome string");
	}
	}

}
