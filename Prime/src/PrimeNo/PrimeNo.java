package PrimeNo;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		int count=0;
		for (int i=3;i<n;i++)
		{
			
			int res=checkPrime(i);
			if (res!=0) {
				
				count++;
				System.out.println(res);
				
			}
		}
		System.out.println("The no of prime nos is "+count );
	}
		public static int checkPrime(int n)
		{
			for (int i=2;i<n;i++)
			{
				if (n%i==0)
				{
					return 0;
				}
			}
			return n;
		
		/*if (n<=1)
		{
			System.out.println("It's not a prime no");
		}
		else if(n==2) {
			System.out.println("It's a prime no");
		}
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("Its not prime");
				
			}
			else 
			{
				System.out.println("It is prime");
			}
		}*/
		
		}

}
