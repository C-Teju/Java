package SumOfCorrespondingElementsOfAnArray;

public class SumOfElements {
	public int[] arrayElmentsSum(int len,int arr_1[],int arr_2[]) {
		int arr_3[]= new int[len];
		for (int i=0;i<=len-1;i++)
		{
			arr_3[i]=arr_1[i]+arr_2[i];
		}
		
		return arr_3;
	}

}
/*non-primitive return type is null(return null;). 
Primitive will have values(return 0;) as return type.*/