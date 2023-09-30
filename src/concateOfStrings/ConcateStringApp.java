package concateOfStrings;

public class ConcateStringApp {
public static String Concate(String s1,String s2)
{
	String s3=s1+s2;
	if(s1.equals(s2))
	{
		
		System.out.println(s3);
	}
	else
	{
		System.out.println("String values are not equal");
	}
	
	return s3;
}
}
