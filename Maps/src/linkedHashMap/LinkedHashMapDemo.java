package linkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import hashMap.Student;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, 11);
		lhm.put(2, 123);
		lhm.put("Three", new Student(1,"Darius",79));
		lhm.put("Four", 101);
		lhm.put(5, "5555");
		System.out.println(lhm);
	
//	Accessing  only the keys using keySet() method which returns
//		a SET object
	Set ke=lhm.keySet();
	System.out.println("keys= "+ke);
//	Accessing key:value pair using entrySet() method which returns
//	a SET object
	Set kv=lhm.entrySet();
	System.out.println("Key:value = "+kv);
//	Accessing only values using values() which returns Collection
//	Object
	Collection val=lhm.values();
	System.out.println("Values = "+val);
	
	}
}
