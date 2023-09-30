package stringAnagram;

import java.util.Arrays;

public class AnagramApp {
	public static String checkAnagram(String str1,String str2)
	{
		/*
		int s2=str1.length();
		int s3=str2.length();
		if(s2==s3)
		{
			System.out.println("both strings are anagram");
		}
		else
		{
			System.out.println("both strings are not anagram");
		}
			*/
		
		
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newStr1=new String(arr1);
		String newStr2=new String(arr2);
		if(newStr1.equals(newStr2))
		{
			return"both strings are anagram";
		}
		else
		{
			return"both strings are not anagram";
		}
			
		
		
		
		
	}

}
