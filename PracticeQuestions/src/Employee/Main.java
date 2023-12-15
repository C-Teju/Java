package Employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		System.out.println("Enter no of employees");
		
		EmployeeManager em=new EmployeeManager(sc.nextInt());
		/*this will call the employee manager constructor and 
		pass 5as capacity*/
		while(b) {
			System.out.println("Enter input-1/2/3:");
			int in=sc.nextInt();
			if(in==1)
			{
				System.out.println("Enter employee name");
				String name=sc.next();
				System.out.println("Enter employee salary");
				double sal=sc.nextDouble();
				em.addEmployee(name,sal);
				
			}
			else if(in==2)
			{
				System.out.println("Enter the employee id");
				int eid=sc.nextInt();
				em.displayEmployee(eid);
			}
			else if(in==3)
			{
				em.allEmployeeList();
			}
			else
			{
				System.out.println("Invalid input");
				b=false;
			}
		}
	}
}
