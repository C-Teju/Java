package Practice;

public class Practice25 {

	public static void main(String[] args) {
		int n= 5;
	    int ch = 65;

	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        if (i == j || i + j == n- 1) {
	          System.out.print((char)(ch+j));
	        } else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	}

}
