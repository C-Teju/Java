package LinkedList;
import java.util.*; 
public class LinkedListsInJava {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("list1 after l1.set(3,10)="+l);
		
		System.out.println("index of 30 in list1="+ l.indexOf(30));
		
		System.out.println("index of 10 in list1="+ l.indexOf(10));
		System.out.println("last index of 10 in list1="+l.lastIndexOf(10));

		LinkedList l2=new LinkedList();
		l2.add("one");
		l2.add("two");
		l2.add("three");
		l2.add("four");
		l2.add("five");
		System.out.println("list2="+l2);
		
		l2.add(l);
		System.out.println("list2 after l2.add(l1)="+l2);
		
//		System.out.println("list2 after l2.add(3,l1)="l2.addAll(3, l2));
	}

	

}
