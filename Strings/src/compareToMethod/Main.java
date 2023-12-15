package compareToMethod;

public class Main {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Saurav";
		if (s1.compareTo(s2)>0)
		{
			System.out.println("String "+s1+"is greater that String "+s2);
		}
		else if (s1.compareTo(s2)<0)
		{
			System.out.println("String "+s2+"is greater that String "+s1);
		}
		else {
			System.out.println("Both Strings"+s1+"and "+s2+" are equal" );
		}
				
				
	}

}
