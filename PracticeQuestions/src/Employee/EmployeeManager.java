package Employee;

public class EmployeeManager {
	private Employee[] emp;
	private int size;
	private int capacity;
	public EmployeeManager(int capacity) {
		emp=new Employee[capacity];
		/*the array is getting initialized with the size of the capacity 
		being passed when object is being created*/
		this.capacity=capacity;
		size=0;
	}
	public void addEmployee(String name, double sal) 
	{
		if(size<capacity) {
			emp[size] =new Employee(name,sal);
			System.out.println("Employee id"+emp[size].getId());
			/*here the emp[size] is an array with employee objects 
			 * so when we call emp[size].getId the object present in 
			 * the index "size" of the array i.e like a[i]==> emp[size]
			 * the employee objects getId is called.
			 * i.e here instead of object creation we created the array*/
			size++;
		}
		else {
			System.out.println("No vacancy in the company");
		}
		
	}
	public void displayEmployee(int eid)
	{
		for(int i=0;i<size;i++) {
			if (eid==emp[i].getId()) {
				System.out.println("Employee details: ");
				System.out.println("Employee ID: "+emp[i].getId());
				System.out.println("Employee ID: "+emp[i].getName());
				System.out.println("Employee ID: "+emp[i].getSalary());
			}
		}
		
	}
	public void allEmployeeList() {
		for(int i=0;i<size;i++) {
				System.out.println("Employee details: ");
				System.out.println("Employee ID: "+emp[i].getId());
				System.out.println("Employee ID: "+emp[i].getName());
				System.out.println("Employee ID: "+emp[i].getSalary());
		}
		
	}
}
