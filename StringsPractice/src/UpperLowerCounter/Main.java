package UpperLowerCounter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc	=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	CountUppLow countUppLow=new CountUppLow();
	countUppLow.count(str);

	}

}
