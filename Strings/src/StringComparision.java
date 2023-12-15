
public class StringComparision {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4=s1+s2;
		if (s3==s4)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References aren't equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings aren't equal");
		}
	}

}
