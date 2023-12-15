package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to cacuator app");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		multiply(a,b);
		System.out.println("-----------main() ended-----------");
	}

	public static void multiply(int a, int b) {
		System.out.println("multiply() Started");
		int product=a*b;
		System.out.println("product= "+product);
		divide(a,b);
		System.out.println("-----------multiply() ended-----------");
	}

	public static void divide(int a, int b) {
		System.out.println("divide() Started");
		int quotient=0;
		try {
		quotient=a/b;
		System.out.println("quotient= "+quotient);

		}
		catch (InputMismatchException e)
		{
			System.out.println("Exception handeled");
			throw e;
		}
		System.out.println("-----------divide() ended-----------");
	}

}
