package Employee;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the String");
			int s=sc.nextInt();
			System.out.println("Enter the contents");
			String[] str=new String[s];
			for(int i=0;i<s;i++) {
				str[i]=sc.next();
			}
			char[] a;
			for(int i=0;i<s;i++)
			{
				StringBuilder rev=new StringBuilder(str[i]).reverse();
				String str2=rev.toString();
//				char[] c=str[i].toCharArray();
//				a=new char[str[i].length()];
//				int y=a.length-1;
//				for(int x=0;x<c.length;x++) {
//					a[y]=c[x];
//					y--;
//				}
//				String str1=new String(a);
				if (str[i].equalsIgnoreCase(str2))
				System.out.println("Palindrome");
			else
				System.out.println("not palindrome");
			}
		}
	}


