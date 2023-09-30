package conversionOfUpperToLower;


public class ConversionApp {
	public static String coversion(String s1)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char value=s1.charAt(i);
			if(value>='A' && value<='Z')
			{
				char convertedChar=(char)(value+32);
				sb.append(convertedChar);
			}
			else
			{
				sb.append(value);
			}
		}
		return sb.toString();
		
		}

		
	

}
