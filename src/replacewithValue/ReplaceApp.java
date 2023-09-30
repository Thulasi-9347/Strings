package replacewithValue;

public class ReplaceApp {
	public static void replace(String s1)
	{
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			if(s1.charAt(i)==' ')
			{
				s2=s2+99+" ";
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	

}
