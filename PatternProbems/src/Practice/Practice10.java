package Practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	 
	        System.out.println("Enter no of rows in this pattern?");
	 
	        int n = sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        int num = 1;
	         
	        for (int i = 1; i <= n; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(num+" ");
	                 
	                num++;
	            }
	 
	            System.out.println();
	        }
	 
	}

}
