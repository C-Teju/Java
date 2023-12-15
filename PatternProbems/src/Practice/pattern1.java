package Practice;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
	        //Taking rows value from the user
	 
	        System.out.println("Enter number of rows in this pattern?");
	 
	        int n = scan.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i = n; i >= 1; i--)
	        {
	            for (int j = n; j >= i; j--)
	            {
	                System.out.print(j+" ");
	            }
	 
	            System.out.println();
	        }
	 
	}

}
