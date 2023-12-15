package Practice;

public class Practice19 {

	public static void main(String[] args) {
		int n= 5;
	    int ch = 65;

	    for (int i = 0; i < n; i++) {
	      // printing spaces
	      for (int j = 0; j < n - i - 1; j++) {
	        System.out.print(" ");
	      }
	      // printing alphabets
	      for (int k = 0; k < 2 * i + 1; k++) {
	        if (i == 0 || i == n - 1) {
	          System.out.print((char)(ch+k));
	        } else {
	          if (k == 0 || k == 2 * i) {
	            System.out.print((char)(ch+k));
	          } else {
	            System.out.print(" ");
	          }
	        }
	      }
	      System.out.println();
	    }
	}

}
