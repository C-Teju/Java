package GCD;

import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find its GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		
		
		System.out.println("The GCD of "+m+" and "+n+" is " +GCD.findGCD(m, n));
	}

}
