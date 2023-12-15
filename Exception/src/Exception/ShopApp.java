package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping app");
		shop();
		System.out.println("-----------main() method ended----------");
	}

	public static void shop() {
		System.out.println("---------shop() method started-------------");
		try {
			pay();
		}catch ( InputMismatchException e) {
		System.out.println("Shopping has failed due to inappropriate input !");
		}
		
		System.out.println("------------shop() method endded--------");
	}

	public static void pay() throws InputMismatchException{
		//throws - show warning to method caller
		System.out.println("------pay() method started---------");
		Scanner sc=null;
		System.out.println("enter amount to be paid");
		try {
			sc=new Scanner(System.in);
			double amt=sc.nextDouble();
			System.out.println("Amount paid= "+amt);
		}
		catch (InputMismatchException e) {
			throw e;//re-throwing exception
		}
		sc.close();
		System.out.println("----------pay() method ended--------");
	}
	

}
