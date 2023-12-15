package Priority;

import java.util.PriorityQueue;

public class PriorityQGenerics {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(1);
		p.add(2);
		p.add(3);
//		p.add("Hello"); will throw ClassCastException
//		so use generic for type safety
		System.out.println(p);
		
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("One");
		pq.add("Two");
		pq.add("Three");
		System.out.println(pq);
		
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(1);
		p1.add(2);
		p1.add(3);
//		p1.add("Hello");
		System.out.println(p1);
	}
}
