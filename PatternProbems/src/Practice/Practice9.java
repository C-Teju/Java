package Practice;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        System.out.println("Enter no of rows in this pattern?");
 
        int n = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(0);
                }
            }
 
            System.out.println();
        }
	}

}
