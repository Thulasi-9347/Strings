package duplicateValues;

public class DuplicateApp {
	public static void duplicate(String s1)
	{
		/*int count=0;
		char []ch=s1.toCharArray();
		for(int i=0;i<=ch.length;i++)
		{
			for(int j=i+1;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
			     System.out.println("duplicate characters in a string are"+" "+ch[j]);
				count++;
				}
			}
		}
		System.out.println("duplicate characters count "+count);
		return s1.toString();
		*/
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			
				if(!s2.contains(s1.charAt(i)+""))
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
