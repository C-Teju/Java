package Armstrong;

public class ArmstrongChecker {
	public int armstrongCheck(int n) {
		int sum=0;
		while (n!=0)
		{
			int m=n%10;
			sum=(int) (sum+Math.pow(m, 3));
			n=n/10;
		}
		return sum;
	}
	 

}
