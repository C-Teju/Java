package Practice;

public class Practice24 {

	public static void main(String[] args) {
		   int n = 5;
		    int ch = 65;

		    for (int i = 1; i <= n; i++) {
		      for (int j = 0; j < n - i; j++) {
		        System.out.print(" ");
		      }
		      for (int k = 0; k < i; k++) {
		        System.out.print((char)(ch+k));
		      }
		      System.out.println();
		    }
		    for (int i = 1; i <= n - 1; i++) {
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      for (int k = 0; k < n- i; k++) {
		        System.out.print((char)(ch+k));
		      }
		      System.out.println();
		    }
	}

}
