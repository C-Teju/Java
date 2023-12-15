package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(121, "Lance", 70000);
		Employee e2=new Employee(106, "Darius", 60000);
		Employee e3=new Employee(285, "Seth", 55000);
		Employee e4=new Employee(328, "Max", 50000);
		Employee e5=new Employee(214, "Caleb", 65000);
		
		ArrayList<Employee> lis=new ArrayList<Employee>();
		lis.add(e1);
		lis.add(e2);
		lis.add(e3);
		lis.add(e4);
		lis.add(e5);
		
		System.out.println("Before sorting - empId ASCENDING");
		System.out.println(lis);
		
		EmployeeComparator e=new EmployeeComparator();
		Collections.sort(lis,e);
		
		System.out.println("After sorting - empId ASCENDING");
		System.out.println(lis);
		
	System.out.println("----------------------------------------------------------------------------------"
			+ "---------------------------------------------------------------------------------------------------"
	+ "---------------------------------------------------------------------------------------------------");
			
		
		System.out.println("Before sorting - empId DESCENDING");
		System.out.println(lis);
		
		
		Collections.sort(lis,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.empId > e2.empId) {
					return -1;
				}
				else if(e1.empId < e2.empId) {
					return 1;
				}
				else {
					return 0;
				}
			}
		});
		
		System.out.println("After sorting - empId DESCENDING");
		System.out.println(lis);
		
System.out.println("----------------------------------------------------------------------------------"
		+ "---------------------------------------------------------------------------------------------------"	
+ "---------------------------------------------------------------------------------------------------");


		System.out.println("Before sorting - empName ASCENDING");
		System.out.println(lis);
		
		
		Collections.sort(lis,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
				
			}
		});
		
		System.out.println("After sorting - empName ASCENDING");
		System.out.println(lis);
	
	
	System.out.println("----------------------------------------------------------------------------------"
			+ "---------------------------------------------------------------------------------------------------"	
	+ "---------------------------------------------------------------------------------------------------");


			System.out.println("Before sorting - empName DESCENDING");
			System.out.println(lis);
			
			
			Collections.reverse(lis);

			System.out.println("After sorting - empName DESCENDING");
			System.out.println(lis);
			
			System.out.println("----------------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------------------------------"
			+ "---------------------------------------------------------------------------------------------------");
			
		
					
				
				System.out.println("Before sorting - salary ASCENDING");
				System.out.println(lis);
				
				
				Collections.sort(lis,new Comparator<Employee>() {

					@Override
					public int compare(Employee e1, Employee e2) {
						if(e1.salary > e2.salary) {
							return 1;
						}
						else if(e1.salary < e2.salary) {
							return -1;
						}
						else {
							return 0;
						}
					}
				});
				
				System.out.println("After sorting - salary ASCENDING");
				System.out.println(lis);
				
		System.out.println("----------------------------------------------------------------------------------"
				+ "---------------------------------------------------------------------------------------------------"	
		+ "---------------------------------------------------------------------------------------------------");			
				
				System.out.println("Before sorting - salary DESCENDING");
				System.out.println(lis);
				
				
				Collections.sort(lis,new Comparator<Employee>() {

					@Override
					public int compare(Employee e1, Employee e2) {
						if(e1.salary > e2.salary) {
							return -1;
						}
						else if(e1.salary < e2.salary) {
							return 1;
						}
						else {
							return 0;
						}
					}
				});
				
				System.out.println("After sorting - salary DESCENDING");
				System.out.println(lis);
				
		System.out.println("----------------------------------------------------------------------------------"
				+ "---------------------------------------------------------------------------------------------------"	
		+ "---------------------------------------------------------------------------------------------------");
		
	}
}
