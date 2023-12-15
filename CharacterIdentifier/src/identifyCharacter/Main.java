package identifyCharacter;

import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)

	{

	if (Character.isDigit(ch))
	{
		System.out.println(ch+" is a digit");
	}
	else if (!Character.isLetter(ch))
	{
		System.out.println(ch+" is a special character");
	}
	else
	{
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if (Character.isLowerCase(ch))
			{
				System.out.println(ch+" is a lower case vowel");
			}
			else 
			{
				System.out.println(ch+" is a upper case vowel");
			}
		break;
		default:
			if (Character.isUpperCase(ch))
			{
				System.out.println(ch+" is a upper case consonent");
			}
			else 
			{
				System.out.println(ch+" is a lower case consonent");
			}
	}
	}
	}
	

	
	
	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	}

	

}
