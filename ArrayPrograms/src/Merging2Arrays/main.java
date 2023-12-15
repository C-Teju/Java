package Merging2Arrays;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//contents in array 1
		System.out.println("Enter the length of array-1");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array-1");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		//contents in array 2
		System.out.println("Enter the length of array 2");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		scan.close();
		//call merged array method
		Merging merging=new Merging();
//		the method returns array so store it in an array
		int result[]=merging.mergedArray(arr1, arr2);
		//traverse the array and print its elements
		System.out.println("The merged array is: ");
		for(int x:result)
		System.out.print(x+" ");
	}

}
