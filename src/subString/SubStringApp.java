package subString;

public class SubStringApp {

	public static void String(String str1)
	{
        char []arr=str1.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String str2=" ";
			for(int j=i;j<=arr.length-1;j++)
			{
				str2=str2+arr[j];
				System.out.println(str2);
			}
			
		}
		

	}

}
