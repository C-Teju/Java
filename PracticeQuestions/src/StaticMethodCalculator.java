import java.util.Scanner;

public class StaticMethodCalculator {
	static int a,b;
	public static int add (int a , int b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		System.out.println(add(a,b));
		
	}

}
