package InternAndToCharMethods;

public class Main {

	public static void main(String[] args) {
		String s1=new String("Raja Ram Mohan Roy");
		System.out.println(s1.length());
		System.out.println("========================");
		s1=s1.replace('R','A');
		System.out.println(s1);
		s1=s1.replaceFirst("Aaja", "Raja");
		System.out.println("=============================");
	
	}

}
