package palindrome;

public class PalindromeApp {
	public static String palindrome(String s1)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=s1.length()-1;i>=0;i--)
		{
			sb.append(s1.charAt(i));
			
		}
		return sb.toString();
	}
	

}
