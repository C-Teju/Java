package DuplicateCharacters;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		RemoveDuplicates reD=new RemoveDuplicates();
		String st=reD.removeDuplicate(str);
		System.out.println(st);
		
	}

}
