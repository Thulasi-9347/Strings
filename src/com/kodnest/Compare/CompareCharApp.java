package com.kodnest.Compare;

public class CompareCharApp {
	public static void comparison(String s1,String s2)
	{
		String s3="";
		String s4="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(!s3.contains(s1.charAt(i)+""))
				{
					s3=s3+s1.charAt(i);
				}
		
			for(int j=0;j<=s2.length()-1;j++)
			{
			      if(!s4.contains(s2.charAt(j)+""))
				{
					s4=s4+s2.charAt(j);
				}
			}
		
		}
		
		System.out.println(s3);
		System.out.println(s4);
		
		char []arr1=s3.toCharArray();
		char []arr2=s4.toCharArray();
		String str1="";
		for(int i=0;i<=arr1.length-1;i++)
		{
			
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					str1=str1+arr1[i];
				}
			}
			
		}
		
		System.out.println(str1);
	}

}
