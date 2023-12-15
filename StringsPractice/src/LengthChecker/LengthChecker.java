package LengthChecker;

import java.util.Scanner;

public class LengthChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings to check if its length is equal ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean result=length(s1,s2);
		if (result=true)
		{
			System.out.println("Both strings are of same length");
		}
		else
		{
			System.out.println("Both strings are of different length");
		}
		
	}
	public static boolean length(String str1, String str2)
	{
		if (str1.length()==str2.length())
		{
			return true;
		}
		else {
			return false;
		}
	}

}
