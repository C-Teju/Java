package Practice;

public class Practice16 {

	public static void main(String[] args) {
		 int n = 5;
		    int ch = 65;

		    // printing pattern
		    for (int i = 0; i < n; i++) {
		      // print spaces
		      for (int j = 1; j < n- i; j++) {
		        System.out.print(" ");
		      }
		      // print alphabets
		      for (int k = 0; k <= i; k++) {
		        System.out.print((char)(ch+k));
		      }
		      System.out.println();
		    }
	}

}
