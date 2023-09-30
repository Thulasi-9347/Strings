package com.kodnest.Replace;

public class Replace {
	public static void compare(String s1) {
	
		
		char []arr=s1.toCharArray();
		String s2="";
		for(int i=0;i<=arr.length-1;i++)
		{
	       
	      
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				s2=s2+99;
			}
			else if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			{
				s2=s2+99;
			}
			else
			{
				s2=s2+arr[i];
			}
		}
		System.out.println(s2);
	}

}
