package subString;

public class ReverseSubStringApp {
	public static void String(String str1)
	{
		char []arr=str1.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			String str2=" ";
			for(int j=arr.length-1;j>=i;j--)
			{
				str2=str2+arr[j];
				System.out.println(str2);
			}
		}
	}

}
