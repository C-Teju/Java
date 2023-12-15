package level5;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//number of lines
		{
			//number of spaces in the beginning of each line
			for (int j=5;j>=i ;j--)
			{
				System.out.print(" ");
				
				
			}
			//number of *'s in each line
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
				//if number of *'s is even then print a space
				if(j%2==0)
				{
					System.out.print(" ");
				}
				//if number of *'s is not even then again print a space
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
