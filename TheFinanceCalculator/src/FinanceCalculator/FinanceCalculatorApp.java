package FinanceCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principle,rate,time");
		double principle=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(principle,rate, time));

	}

}
