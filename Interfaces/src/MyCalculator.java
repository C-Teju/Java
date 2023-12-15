
public class MyCalculator implements Calculator {

	@Override
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}

	@Override
	public void multi() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public int div() {
		int a=10;
		int b=20;
		int c=a/b;
		return c;
	}

}
