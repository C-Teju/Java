package CountOfLetters;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a stirng");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		
		for (int i=0;i<=arr.length-1;i++)
		{
			int count=1;
			
			if(arr[i]!=' ')
			{
				for (int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
						
						
					}
					
					
				}
				System.out.print(arr[i]+" = "+count);
			}
		}

	}

}
