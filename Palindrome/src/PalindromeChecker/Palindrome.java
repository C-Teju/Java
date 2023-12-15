package PalindromeChecker;

public class Palindrome {
	public int digitsReverse(int n) {
		int rev=0;
		while (n!=0) {
		int rem=n%10;//last digit
		rev=rev*10+rem;
		n=n/10;
		System.out.println(n);	
		}
		return rev;
	}

}
