package UpperLowerCounter;

public class CountUppLow {
	void count(String str)
	{
		int ucount=0;
		int lcount=0;
		for (int i=0;i<=str.length()-1;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				lcount++;
			}
			else {
				ucount++;
			}
				
		}
		System.out.println("lower case "+lcount);
		System.out.println("Upper case "+ ucount);
	}

}
