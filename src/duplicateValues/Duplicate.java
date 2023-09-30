package duplicateValues;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
		
		DuplicateApp.duplicate(s1);
	}

}
