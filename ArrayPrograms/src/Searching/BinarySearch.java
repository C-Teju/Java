package Searching;

public class BinarySearch {
		public static boolean present(int target,int[] arr) {
			for(int i=0;i<arr.length; i++) {
				int mid,low=0,high=arr.length-1;
				mid=low+high/2;
				if(arr[mid]==target) {
					return true;
				}
				else if(arr[mid]<target) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}				
			return false;
			
		}
}
