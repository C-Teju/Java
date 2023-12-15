package UnicodePrinter;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a strings to display its unicode character.");
		String s1=sc.nextLine();
		convert(s1);
	}
	static void convert(String str)
	{
		for (int i=0;i<=str.length()-1;i++)
		{
			int unicode=(int)str.charAt(i);
			System.out.print(unicode+" ");
		}
	}
}
