import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a decimal value");
		int dec=sc.nextInt();
		sc.close();
		String s="";
		while(dec>0)
		{
			int rem=dec%2;
			s=rem+s;
			dec=dec/2;
		}
		System.out.println("its binary equivalent is "+s);
	}

}
