package ReverseWordsOfString;

import java.util.Scanner;

public class main {

		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a string");
			String str=scan.nextLine();
			ReverseWords rew=new ReverseWords();
			String s1=rew.reverseWords(str);
			System.out.println(s1);
		}
		
	}


