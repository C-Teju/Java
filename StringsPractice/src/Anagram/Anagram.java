package Anagram;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two stirng");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		char ar1[]=str2.toCharArray();
		
		
		int c=0;
		for (int i=0;i<=ar1.length-1;i++)
		{
			
			if(str1.contains(String.valueOf(str2.charAt(i))))
			{
				c++;
			}
			else {
				c=-1;
			}
			
		}
		if(c>0) {
			System.out.println("anagram");
			
		}else {
			System.out.println("not anagram");
		}
		
	}
}
