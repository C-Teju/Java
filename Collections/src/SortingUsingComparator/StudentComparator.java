package SortingUsingComparator;

import java.util.Comparator;

import SortingComplexObjectsComparable.Student;

public class StudentComparator implements Comparator<Student> {
	
	

		@Override
		public int compare(Student s1, Student s2) {
			if(s1.id > s2.id) {
				return 1;
			}
			else if(s1.id < s2.id) {
				return -1;
			}
			else {
				return 0;
			}
			
			
		}
			
		
		

}
