package Practice;

public class Practice21 {

	public static void main(String[] args) {
		 int n = 5;
		    int ch = 65;

		    // upper pyramid
		    for (int i = 1; i <= n; i++) {
		      // printing spaces
		      for (int j = n; j > i; j--) {
		        System.out.print(" ");
		      }
		      // printing alphabets
		      for (int k = 0; k < i*2-1; k++) {
		        if (k == 0 || k == 2*i-2) {
		          System.out.print((char)(ch+k));
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }

		    // lower triangle
		    for (int i = 1; i < n; i++) {
		      // printing spaces
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      // printing alphabets
		      for (int k = 0; k <= (n-i-1)*2; k++) {
		        if (k == 0 || k == (n-i-1)*2) {
		          System.out.print((char)(ch+k));
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
	}

}
