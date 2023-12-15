import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a binary value");
		int bin=sc.nextInt();
		sc.close();
		int count=0;
		int num = 0;
		while(bin>0) {
		int temp=bin%10;
		
		num=num+temp*(int) Math.pow(2, count);
		count ++;
		bin=bin/10;
		
		
		}
		System.out.println(num);
	}

}
