package frequencyOfString;
import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
		
	System.out.println("enter a string value");
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
FrequencyApp.frequency(str);
	}
}
