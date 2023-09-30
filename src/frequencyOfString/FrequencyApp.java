package frequencyOfString;

public class FrequencyApp {
	public static void frequency(String str)
	{
		int count=0;
		
		String []s1=str.split(" ");
		String newStr=" ";
		for(int i=0;i<=s1.length-1;i++)
		{
			for(int j=0;i<=s1.length-1;j++)
			{
				if(s1[j]==s1[j+1])
				{
					newStr=newStr+count;
					count++;
				}
				
			}
			System.out.println(newStr+count);
			}
			
		}
		
	}


