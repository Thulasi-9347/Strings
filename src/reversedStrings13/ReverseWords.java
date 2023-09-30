package reversedStrings13;
import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string value");
		String s1=scan.nextLine();
		ReverseWordsApp.reverseWordsOrder(s1);
	}

}
