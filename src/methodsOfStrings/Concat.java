package methodsOfStrings;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		System.out.println(s1);
	String s2=	s1.concat("tech");
		System.out.println(s2);
		String s3="javatech";
		if(s2==s3)
		{
			System.out.println("it is inside string pool");
		}
		else
		{
			System.out.println("it is outside string pool");
		}

	}

}
