package replacewithValue;
import java.util.Scanner;
public interface Replace {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		ReplaceApp.replace(s1);
	}
}
