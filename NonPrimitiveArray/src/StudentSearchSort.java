
public class StudentSearchSort {
	static public boolean studentLinearSearch(Student []arr,String nameKey)

	{

	for(int i=0;i<=arr.length-1;i++)

	{

	if(arr[i].name.equals(nameKey))

	{

	System.out.println("Student Found");

	return true;

	}

	}

	return false;

	}

	static public void studentBubbleSort(Student arr[])

	{

	for(int i=0;i<=arr.length-2;i++)

	{

	for(int j=0;j<=arr.length-2-i;j++)

	{

	if(arr[j].id>arr[j+1].id)

	{

	Student temp;

	temp=arr[j];

	arr[j]=arr[j+1];

	arr[j+1]=temp;

	}

	}

	}

	}
	public static void studentSelectionSort(Student[] arr)
	{
		int min;
		
		Student temp;
		for(int i=0;i<=arr.length-1;i++)
		{
			min=i;
			
			for (int j=i+1;j<=arr.length;j++)
			{
				if (arr[j].id<arr[min].id)
				{
					min=j;
					
				}
			}
			if(min!=i) {
				
			
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			}
		}
	}
	

	static public void studentInsertionSort(Student arr[]) 
	{
		Student item;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			item=arr[i];
			int j=i-1;
			while(j>0 && arr[j].id>item.id)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	

	public static boolean studentBinarySearch(Student arr[],int idKey)

	{

	int low=0;

	int high=arr.length-1;

	while(low<=high)

	{

	int mid=(low+high)/2;

	if(arr[mid].id==idKey)

	{

	System.out.println("Student Id Found and the name is "+arr[mid].name);

	return true;

	}

	else if(idKey>arr[mid].id)

	{

	low=mid+1;

	high=high;

	}

	else

	{

	high =mid-1;

	low=low;

	}

	}

	return false;

	}

	static public void studentArrayPrint(Student []arr)

	{

	for(int i=0;i<=arr.length-1;i++)

	{

	System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");

	}

	}

	static public void studentAppRatingPrint(int noofstars)

	{

	for(int i=1;i<=noofstars;i++)

	{

	System.out.print("* ");

	}

	}

	

}
