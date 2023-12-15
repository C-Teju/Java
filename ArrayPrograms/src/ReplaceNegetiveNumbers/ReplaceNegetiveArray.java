package ReplaceNegetiveNumbers;

public class ReplaceNegetiveArray {
	public static int[] replace(int arr[],int j) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=j;
			}
		}
		return arr;
	}
}
