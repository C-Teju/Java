package PalindromeChecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		scan.close();
		Palindrome reverse=new Palindrome();
		int sum=reverse.digitsReverse(n);
		System.out.println(sum);
		if (n==sum) {
			System.out.println("It is a palindrome");	
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
