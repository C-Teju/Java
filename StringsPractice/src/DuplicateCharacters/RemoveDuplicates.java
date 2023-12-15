package DuplicateCharacters;

public class RemoveDuplicates {
	
	public String removeDuplicate(String str) {
		String str2="";
		char arr1[]=str.toCharArray();
		char arr2[]=new char[str2.length()];
		for (int i=0;i<=arr1.length-1;i++)
		{
			for (int j=0;j<=arr2.length-1;j++)
			{
				if (arr1[i]!=arr2[j])
				{
					arr2[j]=arr1[i];
				}
				else
				{
					continue;
				}
			}
		}
			
		str2=new String(arr2);
		return str2;
	}


}
