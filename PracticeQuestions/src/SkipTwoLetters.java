import java.util.Scanner;

public class SkipTwoLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Samsung Electronics";
		char[] arr=s.toCharArray();
		for(int i=0;i<=arr.length-1;i+=3)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.println(arr[j]);
				
			}
			System.out.println();
		}
	}

}
