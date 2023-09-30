package reverseTheWord;

public class ReverseTheWord {
	public static void reverse(String s1)
	{    String s2="";
		String[]str=s1.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			s2=s2+str[i]+" ";
			
		}
		System.out.println(s2);
	}

}
