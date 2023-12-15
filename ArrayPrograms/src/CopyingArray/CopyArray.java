package CopyingArray;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The elements in the new array are: ");
		for(int g:arr)
		{
			System.out.print(g+" " );
			
		}
		System.out.println();
		int arr2[]=new int[arr.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr[i];
		}
		System.out.println("The elements in the copied array are: ");
		for(int g:arr2)
		{
			System.out.print(g+" " );
			
		}
	}

}
