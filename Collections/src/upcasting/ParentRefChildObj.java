package upcasting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ParentRefChildObj {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		System.out.println(l2);
		
		Queue<Integer> q1=new ArrayDeque<Integer>();
		q1.add(100);
		q1.add(202);
		q1.add(302);
		System.out.println(q1);
		
		Queue<Integer> q2=new PriorityQueue<Integer>();
		q2.add(00);
		q2.add(02);
		q2.add(02);
		System.out.println(q2);
	}

}
