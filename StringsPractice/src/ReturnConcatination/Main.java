package ReturnConcatination;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings to concatinate them. ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		ReturnConcat.length(s1, s2);
	}

}
