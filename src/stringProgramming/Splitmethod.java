package stringProgramming;

public class Splitmethod {
	public static void main(String[] args) {
		String s1="java sql python";
		String []s2=s1.split(" ");
		for( String x:s2)
		{
			System.out.println(x);
		}
	}

}
