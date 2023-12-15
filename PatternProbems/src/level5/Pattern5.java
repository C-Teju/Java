package level5;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//number of lines
		{
			//number of spaces in the beginning of each line
			for (int j=5;j>=i ;j--)
			{
				System.out.print(" ");
				
			}
			System.out.print("*");
			//number of *'s in each line
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
				//if number of *'s is even then print a space
				if(i>1 && i<5)
				{
					System.out.print("*");
				}
				//if number of *'s is not even then again print a space
				
			}
			
			System.out.println();
		}
	}

}
