package ReverseString;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=scan.nextLine();
		System.out.println("the entered string is "+s1 );
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		s1=new String(arr2);
		System.out.println("The reversed array is "+s1);
	}

}
