package com.kodnest.Compare;

import java.util.Scanner;

public class CompareChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the strings values");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		CompareCharApp.comparison(s1, s2);
	}

}
