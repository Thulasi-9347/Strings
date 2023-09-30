package reverseString;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
		String result=ReverseStringApp.reverse(s1);
		System.out.println("reversed string value is"+result);
	}

}
