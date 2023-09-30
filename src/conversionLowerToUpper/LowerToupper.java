package conversionLowerToUpper;

import java.util.Scanner;

public class LowerToupper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
	String Convert=	ConversionLowerToUpper.coversion(s1);
	System.out.println("converted string from lower case to upper case"+Convert);
}
}