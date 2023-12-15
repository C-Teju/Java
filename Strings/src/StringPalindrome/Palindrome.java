package StringPalindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=scan.nextLine();
		boolean res=isPalindrome(s1);
		scan.close();
		if (res=true)
			System.out.println("the string is a palindrome");
		else
			System.out.println("the string is not a palindrome");	
	}
	public static boolean isPalindrome(String s1)
	{
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		String s2=new String(arr2);
		System.out.println("the string after reversal is "+s2);
		if (s1.equalsIgnoreCase(s2))
		return true;
		else
		return false;
	}

}
