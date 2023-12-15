package linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		h.add(1);
		h.add(200);
		h.add(350);
		h.add(420);
		System.out.println(h);
	}

}
