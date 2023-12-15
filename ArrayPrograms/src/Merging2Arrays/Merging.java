package Merging2Arrays;

public class Merging {
	public int[] mergedArray(int arr1[],int arr2[]) 
	//this method accepts arrays and returns an array
	{
//		creating a 3rd array of size equal to the size of 1st 
//		and 2nd array. 
		int arr3[]=new int[arr1.length+arr2.length];
		/*
		 * // adding elements of 1st array to the 3rd array 
		 * for(int i=0;i<=arr1.length-1;i++) {
		 *  arr3[i]=arr1[i]; } 
		 *  // adding elements of 2st array to the 3rd array 
		 * for(int i=0;i<=arr2.length-1;i++) {
		 * arr3[arr1.length+i]=arr2[i]; }
		 *  return arr3;
		 * 
		 */
//write in while loop also.
		int i=0;
		while (i<arr1.length) {
			arr3[i]=arr1[i];
			i++;
		}
		int j=0;
		while (j<arr2.length) {
			arr3[arr1.length+j]=arr2[j];
//			add the 2nd array elements after the elements of 1st 
//			array are added.---> arr3[arr1.length+j]
			j++;
		}
		return arr3;
	}
}
