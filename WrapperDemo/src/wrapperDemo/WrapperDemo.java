package wrapperDemo;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
//		Auto-Boxing
		l1.add(10);     //l1.add(new Integer(10));
		l1.add(20);		//l1.add(new Integer(20));
		l1.add(30);		//l1.add(new Integer(30));
		
//		Auto-Unboxing
		int i1=l1.get(0);	//(int)l1.get(0);
		int i2=l1.get(1);	//(int)l1.get(1);
		int i3=l1.get(2);	//(int)l1.get(2);
		
	}

}
