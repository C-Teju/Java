package Practice;

public class Practice17 {

	public static void main(String[] args) {
		 int n = 5;
		    int ch = 65;

		    for (int i = 1; i <= n; i++) {
		      for (int j = 0; j < i; j++) {
		        // not last row
		        if (i != n) {
		          if (j == 0 || j == i - 1) {
		            System.out.print((char)(ch+j));
		          } else {
		            System.out.print(" ");
		          }
		        }
		        // last row, print only alphabets
		        else {
		          System.out.print((char)(ch+j));
		        }
		      }
		      System.out.println();
		    }
	}

}
