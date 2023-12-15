package RomanToInteger;

import java.util.Scanner;

public class RomanToInteger {
	public static int value(char r) {
		switch (r) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
	}
		return r;	
			
	}
	
	public static int romanToInteger(String s) {
		int v = -1;
		for(int i=0;i<s.length();i++) 
		{if(i+1<s.length()) 
		{
			
			int s1=value(s.charAt(i));
			int s2=value(s.charAt(i+1));
			if(s1>s2) {
				v=s1-s2;
			}
			else if(s1<s2) {
				v=s1+s2;
			}
		}
		}
		
		return v;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roman number");
		String r=sc.nextLine();
		int num=romanToInteger(r);
		System.out.println(num);
	}
}


