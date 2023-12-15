import java.util.Scanner;

public class Calci implements Calculator {
	Scanner s=new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a-b;
		System.out.println(c);
	}

	@Override
	public void multi() {
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public int div() {
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		return c;
	}

}
