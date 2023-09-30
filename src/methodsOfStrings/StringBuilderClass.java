package methodsOfStrings;

public class StringBuilderClass {
public static void main(String[] args) {
	StringBuilder s1=new StringBuilder();
	
	s1.append("java");
	s1.append("python");
	s1.append('c');
	s1.append(0.0);
	s1.append(25);
	s1.append(s1);
	
	System.out.println(s1);
}
}
