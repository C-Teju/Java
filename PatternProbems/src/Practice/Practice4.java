package Practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        //Taking rows value from the user
	 
	        System.out.println("Enter number of rows in this pattern?");
	 
	        int n = sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!"); 
	 
	        for (int i = n; i >= 1; i--)
	        {
	            //Printing rows-i spaces at the beginning of each row
	 
	            for (int j = 1; j <= n-i; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing i value i times at the end of each row
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i+" ");
	            }
	 
	            System.out.println();
	        }
	}

}
