package SumOfDigits;
import java.util.Scanner;
public class SumOfDigits {
	public static void calculateSumOfDigits(int n){

	// your code here
		int sum=0;
		while(n!=0) {
		
		int rem=n%10;//Separate the last number
		n=n/10;//Remove last number
		sum+=rem;//Add last number to sum
		}
		System.out.println(sum);

	}

	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	scan.close();
	calculateSumOfDigits(n);

	}
	
}
