package LowertoUpperConverter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		Convert ul=new Convert();
		System.out.println(ul.convert(s1));	
		
	}

}
