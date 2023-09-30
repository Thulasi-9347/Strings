package stringAnagram;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two string values");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		System.out.println(AnagramApp.checkAnagram(str1, str2));
	}

}
