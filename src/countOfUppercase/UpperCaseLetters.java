package countOfUppercase;

import java.util.Scanner;

public class UpperCaseLetters {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
		CountOfUpperCase.countvalues(s1);
}
}