package Practice;

public class Practice22 {

	public static void main(String[] args) {
		int n = 5;
	    int ch = 65;

	    // reversed pyramid alphabet pattern
	    for (int i = 0; i < n; i++) {
	      // printing spaces
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	      // printing alphabets
	      for (int k = 0; k < (n- i) * 2 - 1; k++) {
	        System.out.print((char)(ch+k));
	      }
	      System.out.println();
	    }

	    // pyramid alphabet pattern
	    for (int i = 2; i <= n; i++) {
	      // printing spaces
	      for (int j = n; j > i; j--) {
	        System.out.print(" ");
	      }
	      // printing alphabet
	      for (int k = 0; k < i * 2 - 1; k++) {
	        System.out.print((char)(ch+k));
	      }
	      System.out.println();
	    }
	}

}
