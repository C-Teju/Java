package hashMap;

import java.util.HashMap;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(1, 11);
		hm.put(2, 123);
		hm.put("Three", new Student(1,"Mahesh",79));
		hm.put("Four", 101);
		hm.put(5, "5555");
		System.out.println(hm);
	}

}
