package forEachLoop;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int [scan.nextInt()];
		System.out.println("Enter the contents of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for (int a  : arr) {
			System.out.print(a+5+" ");
//			here 'a' is the actual element and not the index.
		}

	}

}
