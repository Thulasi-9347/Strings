package conversionOfUpperToLower;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
	String convert=	ConversionApp.coversion(s1);
	System.out.println("converted String"+convert);

}
}