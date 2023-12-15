package Armstrong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		ArmstrongChecker armstrongChecker=new ArmstrongChecker();
		int armstrong=armstrongChecker.armstrongCheck(n);
		System.out.println(armstrong);
		if (n==armstrong) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
	}

}
