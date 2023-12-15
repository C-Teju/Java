package ReplaceSpaceWith99;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		Replace99 re=new Replace99();
		String st1=re.replace(str);
		System.out.println(st1);
	}

}
