package unicodeValue;

import java.util.Scanner;

public class UnicodeValue {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string values");
	String s1=scan.nextLine();

	UnicodeValueString.unicode(s1);
	}
}
