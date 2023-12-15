package Practice;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows in this pattern?");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
    		for(int j=i;j<=n;j++)
    		{ 		
        			System.out.print((char)(j+64));
    		} 
    		System.out.println("");
		}
	}

}
