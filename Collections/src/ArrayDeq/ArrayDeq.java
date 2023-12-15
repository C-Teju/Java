package ArrayDeq;

import java.util.ArrayDeque;

public class ArrayDeq {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20.23);
		ad.add("Thirty");
		ad.add(true);
		System.out.println(ad);
		
		System.out.println("First element="+ad.getFirst());
		System.out.println("Last element="+ad.getLast());
		
		ad.addFirst(111);
		ad.addLast(999);
		
		System.out.println(ad);
		
		System.out.println("First element="+ad.getFirst());
		System.out.println("Last element="+ad.getLast());
	}

}
