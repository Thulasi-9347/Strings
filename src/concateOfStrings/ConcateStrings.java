package concateOfStrings;

import java.util.Scanner;

public class ConcateStrings {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the strings values");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		ConcateStringApp.Concate(s1, s2);
	}

}
