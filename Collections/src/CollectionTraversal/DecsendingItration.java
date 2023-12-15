package CollectionTraversal;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DecsendingItration {

	public static void main(String[] args) {
		ArrayDeque<Object> ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(20.23);
		ad.add("Thirty");
		ad.add(true);
//		using descending iterator(backward traversing)
		Iterator<Object> itr1=ad.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+" ");
		}
	}

}
