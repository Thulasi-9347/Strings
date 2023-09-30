package reverseAtPositions;

public class PositionsApp {
	public static void theWord(String s1)
	{
		
		
		String[] str=s1.split(" ");
		for(String x:str)
		{
          String newStr=" ";
		
		for(int i=x.length()-1;i>=0;i--)
		{
			newStr=newStr+x.charAt(i);
		}
		System.out.print(newStr);
	}
	
	}
}
