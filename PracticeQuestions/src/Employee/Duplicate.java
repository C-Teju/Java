package Employee;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the String");
		int s=sc.nextInt();
		System.out.println("Enter the contents");
		String[] str=new String[s];
		for(int i=0;i<s;i++) {
			str[i]=sc.next();
		}
		
		System.out.println("Duplicate elements");
		
		for(int i=0;i<s;i++)
		{
			for (int j=i+1;j<s;j++) {
				if(str[i].equals(str[j])) {
					
					System.out.print(str[j]);
				}
			}
		}
		
	}

}
