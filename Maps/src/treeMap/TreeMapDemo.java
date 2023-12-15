package treeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map1=new TreeMap();
		map1.put(1,100);
		map1.put(2,new Student(1,"Akash",87));
		map1.put(3,100);
		map1.put(4,100);
//		map1.put("Five",100);    ---------->ClasssCastException
		System.out.println(map1);
	}

}
