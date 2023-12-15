import java.util.Scanner;

public class Meter {
	public static void main(String[] args) {
		System.out.println("Enter to which unit to convert");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		double m=sc.nextDouble();
		sc.close();
		if(s.equalsIgnoreCase("Kilometer"))
		{
			Kilometer km=new Kilometer(m);
			System.out.println(km.convertToKm(m));
		}
		else if(s.equalsIgnoreCase("Centimeter")) {
			Centimeter cm=new Centimeter(m);
			System.out.println(cm.convertToCm(m));
		}
	}

}
