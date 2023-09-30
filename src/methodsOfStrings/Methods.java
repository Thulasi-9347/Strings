package methodsOfStrings;

public class Methods {
	public static void main(String[] args) {
		String s1="kodnest Technologies pvt Ltd";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.endsWith("ltd"));
		System.out.println(s1.endsWith("pvt"));
		System.out.println(s1.startsWith("kodnest"));
		System.out.println(s1.indexOf("p"));
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.lastIndexOf("d"));
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(22));
		System.out.println(s1.contains("Tec"));
		System.out.println(s1.substring(8,19));
		System.out.println(s1.replace('o', 'a'));
		String s2="abbab";
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));
		System.out.println(s2.length());
		
		
		
	}

}
