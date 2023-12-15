package ReverseSpacePreserved;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		Reverse reverse=new Reverse();
		reverse.reverseString(str);
	}

}
