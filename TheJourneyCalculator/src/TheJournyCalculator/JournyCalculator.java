package TheJournyCalculator;

public class JournyCalculator {
	public static void main(String[] args) {
		
		TheJournyCalculator journeyCalculator = new TheJournyCalculator();

		double result=journeyCalculator.calculateDistance(60.0, 1.5);
		System.out.printf("%.2f",result);
	
	}

}
