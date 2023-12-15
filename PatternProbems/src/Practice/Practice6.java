package Practice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        System.out.println("Enter no of rows in this pattern?");
	 
	        int n = sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i = 1; i <= n; i++)
	        {
	            int num;
	 
	            if(i%2 == 0)
	            {
	                num = 0;
	 
	                for (int j = 1; j <= n; j++)
	                {
	                    System.out.print(num);
	 
	                    num = (num == 0)? 1 : 0;
	                }
	            }
	            else
	            {
	                num = 1;
	 
	                for (int j = 1; j <= n; j++)
	                {
	                    System.out.print(num);
	 
	                    num = (num == 0)? 1 : 0;
	                }
	            }
	 
	            System.out.println();
	        }
	}

}
