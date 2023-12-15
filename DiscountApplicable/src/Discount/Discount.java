package Discount;

import java.util.Scanner;

public class Discount {
	

	

	public static void checkDiscount(double purchaseAmount)

	{ // your code here
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount Not-Applicable");
		}

	}

	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase amount");
		double purchaseAmount=sc.nextDouble();
		checkDiscount(purchaseAmount);
	}

	}
	


