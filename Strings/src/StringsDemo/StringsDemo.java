package StringsDemo;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters");
		char arr[]=new char[sc.nextInt()];
		
		System.out.println("Enter array elements");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		sc.close();
		for (char c : arr) {
			System.out.print(c+" | ");
		}
		System.out.println();
		char arr1[]=new char [arr.length];
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=arr[i];
		}
		for (char c : arr1) {
			System.out.print(c+" | ");
		}
		System.out.println();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		for (char c : arr2) {
			System.out.print(c+" | ");
		}
	}
}
