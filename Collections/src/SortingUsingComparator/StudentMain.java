package SortingUsingComparator;


	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;

import SortingComplexObjectsComparable.Student;

	public class StudentMain {

		public static void main(String[] args) {
			Student s1=new Student(10,"ABC",78);
			Student s2=new Student(40,"XYZ",88);
			Student s3=new Student(20,"PQR",36);
			ArrayList<Student> lis=new ArrayList<Student>();
			lis.add(s1);
			lis.add(s2);
			lis.add(s3);
			System.out.println("Before sorting id");
			System.out.println(lis);
			 
			StudentComparator s=new StudentComparator();
			Collections.sort(lis,s);
			
			System.out.println("After sorting id");
			System.out.println(lis);
			
			System.out.println("Before sorting name");
			System.out.println(lis);
			 
			
			Collections.sort(lis,new Comparator<Student>() {

				@Override
				public int compare(Student a1, Student a2) {
					return a1.getName().compareTo(a2.getName());
				}
				
				
			}
			);
			
			System.out.println("After sorting name");
			System.out.println(lis);
			
			System.out.println("Before sorting percentage");
			System.out.println(lis);
			 
			
			Collections.sort(lis,new Comparator<Student>() {

				@Override
				public int compare(Student b1, Student b2) {
					if(b1.percentage > b2.percentage) {
						return 1;
					}
					else if(b1.percentage < b2.percentage) {
						return -1;
					}
					else {
						return 0;
					}
				}
				
				
			}
			);
			
			System.out.println("After sorting percentage");
			System.out.println(lis);
		}

}
