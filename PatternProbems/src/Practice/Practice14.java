package Practice;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   	 
	        System.out.println("Enter no of rows in this pattern?");
	 
	        int n= sc.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i = 1; i <= n; i++)
	        {
	            int num = 1;
	             
	            for (int j = 1; j < i*2; j++) 
	            {
	                if(j % 2 == 0)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(num);
	                     
	                    num++;
	                }
	                 
	            }
	             
	            System.out.println();
	        }
	}

}
