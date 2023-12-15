import java.util.Scanner;

public class Target {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int[] a=new int[sc.nextInt()];
		System.out.println("Enter array contents");
		for (int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		sc.close();
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)//i+1 because we need it to take the element  next to whatever i is
			{
				
				if(a[i]+a[j]==target)
				{
					System.out.print(i+"-"+j);
				}
			}
			
		}
	}

}
