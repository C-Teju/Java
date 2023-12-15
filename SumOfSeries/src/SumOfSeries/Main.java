package SumOfSeries;

import java.util.Scanner;

public class Main {
	public static void calculateSumOfSeries(int n)

	{

	double sum=0;
	for (int i=1;i<=n;i++) {
		
		sum=sum+(1.0/i);
		
	}
	System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to "
				+ "print the sum of series \n"
				+ "\"1 + 1/2 + 1/3 + ... + 1/n\" "
				+ " until n");
		int n=scan.nextInt();
		scan.close();
		calculateSumOfSeries(n);

	}

}
