package SortingComplexObjectsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(10,"ABC",78);
		Student s2=new Student(40,"PQR",88);
		Student s3=new Student(20,"XYZ",36);
		ArrayList<Student> lis=new ArrayList<Student>();
		lis.add(s1);
		lis.add(s2);
		lis.add(s3);
		System.out.println("Before sorting");
		System.out.println(lis);
		
		Collections.sort(lis);
		
		System.out.println("After sorting");
		System.out.println(lis);
	}

}
