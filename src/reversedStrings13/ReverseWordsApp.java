package reversedStrings13;

public class ReverseWordsApp {
	public static String reverseWordsOrder(String s1) 
	{
		/*StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
		*/
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		return s1;
		
	}

}
