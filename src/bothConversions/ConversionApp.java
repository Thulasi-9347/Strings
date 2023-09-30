package bothConversions;

public class ConversionApp {
	public static String conversion(String s1)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char result=s1.charAt(i);
			if(result>='A' && result<='Z')
			{
				char convert=(char)(result+32);
				sb.append(convert);
			}
			else if(result>='a' && result<='z')
			{
				char conversion=(char)(result-32);
				sb.append(conversion);
			}
			else
			{
				sb.append(result);
			}
		}
		return sb.toString();
		
	}

}
