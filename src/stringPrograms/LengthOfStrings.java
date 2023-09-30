package stringPrograms;
import java.util.Scanner;
public class LengthOfStrings {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the strings values");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		LengthOfStringSApp.length(s1, s2);
	}

}
