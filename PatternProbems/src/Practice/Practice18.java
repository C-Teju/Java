package Practice;

public class Practice18 {

	public static void main(String[] args) {
		int n = 5;
	    int ch = 65;

	    for (int i = 0; i < n; i++) {
	      // printing spaces
	      for (int j = 0; j < n-i-1; j++) {
	        System.out.print(" ");
	      }
	      // printing alphabets
	      for (int k = 0; k < 2 * i + 1; k++) {
	        System.out.print((char)(ch+k));
	      }
	      System.out.println();
	    }
	}

}
