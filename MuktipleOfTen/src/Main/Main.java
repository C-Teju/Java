package Main;

import java.util.Scanner;
/*the code is to check if a number is a multiple 
of some other number and not just 10*/
public class Main {
	public static void checkMultipleOfTen(int n,int m) 
	{ // your code here 
		if (n%m==0)
			System.out.println("The number "+n+"is a multiple of "+m);
		else
			System.out.println("The number "+n+" is not a multiple of "+m);
		} 
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the number which it is multiplied with:");
		int m=sc.nextInt();
		
		sc.close();
		checkMultipleOfTen(n,m);
	} 
}

