package methodsOfStrings;

public class CompareMethod {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Surav";
	int s3=	s1.compareTo(s2);
	if(s3>0)
	{
		System.out.println("s1 is greater");
	}
	else if(s3<0)
	{
		System.out.println("s2 is greater");
	}
	else
	{
		System.out.println("both are equal");
	}

	}

}
