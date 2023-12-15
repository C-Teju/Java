package DisplayAllSubstringsOfAGivenString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String s=Substrings.allSubstring(str);
		System.out.println(s);
	}

}
