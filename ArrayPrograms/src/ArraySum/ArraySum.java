package ArraySum;
//keep in separate class
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		int sum=0;

		for(int i: arr)
		{
			sum+=i;
		}
		System.out.println("The sum of elements of array is: "+sum);
	}

}
