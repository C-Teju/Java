package SumOfCorrespondingElementsOfAnArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//
		System.out.println("Enter a length that is same for both array-1 and array-2");
		int n=scan.nextInt();
		//contents in array 1
		int arr1[]=new int[n];
		System.out.println("Enter the elements of array-1");
		for(int i=0;i<=n-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		//contents in array 2

		int arr2[]=new int[n];
		System.out.println("Enter the elements of array-2");
		for(int i=0;i<=n-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		scan.close();
		
		SumOfElements elements=new SumOfElements();
		int[] result=elements.arrayElmentsSum(n, arr1, arr2);
		System.out.println("The sum of corresponding elements of array-1 and array-2 are: ");
		for (int y:result)
		{
			System.out.print(y+" ");
		}
	}

}
