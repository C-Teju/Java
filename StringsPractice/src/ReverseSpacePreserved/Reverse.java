package ReverseSpacePreserved;

public class Reverse {
	void reverseString(String str)
	{
		char ch[]=str.toCharArray();
		char rev[]=new char[ch.length];
		
		for (int i=0;i<=ch.length-1;i++)
		{
			if (ch[i]==' ')
			{
				rev[i]=ch[i];
			}
		}
		for (int i=0;i<=ch.length-1;i++)
		{
			int j=rev.length-1;
			if(ch[i]!=' ')
			{
				if(rev[j]==' ')
				{
				j--;
				}
				rev[j]=ch[i];
				j--;
				
			}
			
		}
		String s2=new String(rev);
		System.out.println(s2);
	}

}
