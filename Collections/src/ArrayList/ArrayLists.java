package ArrayList;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		
		l1.add(3,60);
		System.out.println("list1="+l1);
		
		System.out.println("Data in list1 for l1.get(1)="+l1.get(1));
		
		System.out.println("size of list1="+l1.size());
		
		l1.set(3,10);
		System.out.println("list1 after l1.set(3,10)="+l1);
		
		System.out.println("index of 30 in list1="+ l1.indexOf(30));
		
		System.out.println("index of 10 in list1="+ l1.indexOf(10));
		System.out.println("last index of 10 in list1="+l1.lastIndexOf(10));
		
		ArrayList l2=new ArrayList();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		l2.add("four");
		l2.add("five");
		System.out.println("list2="+l2);
		
		l2.add(l1);
		System.out.println("list2 after l2.add(l1)="+l2);
		
//		System.out.println("list2 after l2.add(3,l1)="l2.addAll(3, l2));
	}

}
