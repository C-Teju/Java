package Practice;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
        //Taking rows value from the user
 
        System.out.println("Enter number of rows in this pattern?");
 
        int n = scan.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int i = 1; i <= n; i++)
        {
            //Printing first half of the row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            //Printing second half of the row 
 
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
	}

}
