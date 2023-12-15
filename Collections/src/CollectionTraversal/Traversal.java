package CollectionTraversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversal {

	public static void main(String[] args) {
		ArrayList<Object> list1=new ArrayList<>();
		list1.add("Shirt");
		list1.add(10);
		list1.add(true);
		list1.add(45.3);
////		using for loop
//		for (int i=0;i<list1.size();i++) {
//			System.out.print(list1.get(i));
//		}
//		System.out.println();
////		using for each loop
//		for(Object s:list1) {
//			System.out.println(s+" ");
//		}
////		using iterator(forward traversing)
//		Iterator itr=list1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next()+" ");
//		}
//		backward traversing in lists using ListIterator
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		ListIterator<Integer> itr1=l2.listIterator(l2.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous() +"  --->backward ");
		}
	}

}
