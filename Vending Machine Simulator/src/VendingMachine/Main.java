package VendingMachine;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)

	{

	switch (productCode) {
	case "P01":
	{
		System.out.println("Coke");
		break;
	}
	case "P02":
	{
		System.out.println("Pepsi");
		break;
	}
	case "P03":
	{
		System.out.println("Red Bull");
		break;
	}
	case "P04":
	{
		System.out.println("Sting");
		break;
	}
	default:
	{
		System.out.println("Enter valid code");
		
	}
	}

	}

	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product code: ");
		String productCode= sc.nextLine();
		sc.close();
		getProduct(productCode);

	}

}
