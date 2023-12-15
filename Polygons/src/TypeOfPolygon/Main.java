package TypeOfPolygon;

import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)

	{ 
		if (sides<3)
		{
			System.out.println("Not a Polygon");
		}
		else {
		switch (sides) {
		case 3:
		{
			System.out.println("Triangle");
			break;
		}
		case 4:
		{
			System.out.println("Quadrilatral");
			break;
		}
		case 5:
		{
			System.out.println("Pentagon");
			break;
		}	
		case 6:
		{
			System.out.println("Hexagon");
			break;
		}
		default:
			System.out.println("Polygon");
		}
		}
	} 
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of sides: ");
			int sides= sc.nextInt();
			sc.close();
			identifyPolygon(sides);
		 
		
	}

}
