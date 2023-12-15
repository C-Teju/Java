package Fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits in the fibonacci series to be printed");
		int n=sc.nextInt();
		fibonacciCalculation(n);
		
	}
	public static void fibonacciCalculation(int n)
	{
		int fib1=0;
		int fib2=1;
		if (n==1)
		{
			System.out.println(fib1);
		}
		else if (n==2)
		{
			System.out.print(fib1+" "+fib2);
		}
		else
		{
			System.out.print(fib1+" "+fib2+" ");
		     for(int i=3;i<=n;i++)
		     {
		    	int nextNo=fib1+fib2;
		    	System.out.print(nextNo+" ");
		    	fib1=fib2;
		    	fib2=nextNo;
		     }
		}
	}

}
