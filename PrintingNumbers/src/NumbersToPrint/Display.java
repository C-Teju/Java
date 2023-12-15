package NumbersToPrint;

public class Display {
	public static void twoDivisible(int n)
	{
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("the numbers divisible by 2 are" +i);
			}
			
		}
		
	}
	public static void threeDivisible(int n)
	{
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("the numbers divisible by 3 are" +i);
			}
			
		}
	}
	public static void fiveDivisible(int n)
		{
			for (int i=1;i<=n;i++)
			{
				if(i%5==0)
				{
					System.out.println("the numbers divisible by 5 are" +i);
				}
				
			}
		}
		public static void twoAndFiveDivisible(int n)
			{
				for (int i=1;i<=n;i++)
				{
					if(i%2==0 && i%5==0)					{
						System.out.println("the numbers divisible by 2 and5 are" +i);
					}
					
				}
			}
			public static void threeAndFiveDivisible(int n)
				{
					for (int i=1;i<=n;i++)
					{
						if(i%3==0 && i%5==0)					{
							System.out.println("the numbers divisible by 3 and5 are" +i);
						}
						
					}
				}
			public static void  prime(int n)
			{
				for (int i=2;i<=Math.sqrt(n);i++)
				{
		
						if(n%i==0)
						{
							System.out.println("Its not prime");
							
						}
						else 
						{
							System.out.println("It is prime");
						}				
				}
			}
			public static void threeAndFiveDivisible(int n)
			{
				for (int i=1;i<=n;i++)
				{
					if(i%3==0 && i%5==0)					{
						System.out.println("the numbers divisible by 3 and5 are" +i);
					}
					
				}
			}
			
	}
	

}
