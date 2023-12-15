import java.util.Scanner;

public class PrintRemainingStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String ip=sc.nextLine();
		System.out.println("Enter a letter from which the remaining will be printed");
		char key=sc.next().charAt(0);
		sc.close();
		int count=0;
		for (int i=0;i<ip.length();i++)
		{
			if(key==ip.charAt(i))
			{
				count++;
				for (int j=i+1;j<ip.length();j++)
				{
				System.out.print(ip.charAt(j));
				
				}
				break;
			}
			
		}
		if(count==0)
		{
		System.out.println(ip);
		}
	}
	
}


