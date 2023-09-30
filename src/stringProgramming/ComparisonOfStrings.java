package stringProgramming;

public class ComparisonOfStrings {
	public static void main(String[] args) {
		String s1="Sql";
		String s2="KodNest";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s1==s2)
		{
			System.out.println("reference variables are equal");
		}
		else
		{
			System.out.println("reference variables are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("string values are equal");
		}
		else
		{
			System.out.println("string values are not equal");
		}
		if(s3.equalsIgnoreCase(s4))
		{
			System.out.println("string values are equal After ignoring the case ");
		}
		else
		{
			System.out.println("string values are not equal after ignoring the case");
		}
		
	}

}
