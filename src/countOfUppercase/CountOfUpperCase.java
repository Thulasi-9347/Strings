package countOfUppercase;

public class CountOfUpperCase {
	public static void countvalues(String s1)
	{
	int count =0;int value=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c=s1.charAt(i);
		if(c>='A' && c<='Z')
		{
			
			
			count++;
			
		}
		
		
		else if(c>='a' &&c<='z')
		{
			
			 
			value++;
					}
		
	}
	System.out.println("upper case letters in a string are"+count);
	System.out.println("lower case letters in a string are"+value);

	}
}
