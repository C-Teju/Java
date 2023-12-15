package BestIndex;

import java.util.Scanner;

public class BestIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enetr the elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bestIndex(arr);
			
		}
		public static void bestIndex(int[] arr) {
			int l=arr.length;
			int psum=Integer.MIN_VALUE;
			for (int i=0;i<l;i++) {
				int j=2;
				int t=2;
				int a=i+1;
				int csum=arr[i];
				while(i+j<l) {
					int c=a;
					for (int k=a;k<=i+j;k++) {
						csum+=arr[k];
					}
					t++;
					j+=t;
				}
				if(csum>psum) {
					psum=csum;
				}
				System.out.print(csum+" ");
			}
			
	}
	
	
}
