import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many objects you want to create");

		int noo=scan.nextInt();

		Student arr[]=new Student[noo];

		for(int i=0;i<=arr.length-1;i++)

		{

		System.out.println("Enter ID");

		int id=scan.nextInt();

		System.out.println("Enter Name");

		String name=scan.next();

		System.out.println("Enter marks");

		int marks=scan.nextInt();

		arr[i]=new Student(id, name, marks);

		}

		StudentSearchSort.studentArrayPrint(arr);

		System.out.println();

		System.out.println("Enter name to search");

		String nameKey=scan.next();

		boolean res=StudentSearchSort.studentLinearSearch(arr, nameKey);

		if(!res)

		{

		System.out.println("Student not found");

		}

		System.out.println();

			System.out.println("Enter your choice to sort \n 1-Bubble sort\n 2-Selection sort\n 3-Insertion sort");
			int ch=scan.nextInt();
			switch (ch) {
			case 1:
			
				StudentSearchSort.studentBubbleSort(arr);
				break;
			
			case 2:
			
				StudentSearchSort.studentSelectionSort(arr);
				break;
			
			case 3:
			
				StudentSearchSort.studentInsertionSort(arr);
				break;
			
			default:
				System.out.println("Invalid choice. Using bubble sort.");
				StudentSearchSort.studentBubbleSort(arr);
			}

		

		

		StudentSearchSort.studentArrayPrint(arr);

		System.out.println();

		System.out.println("Enter Id to search");

		int idKey=scan.nextInt();

		res=StudentSearchSort.studentBinarySearch(arr, idKey);

		if(!res)

		{

		System.out.println("Student not found");

		}

		System.out.println("Rate The Application....out of 10");

		int noofstars=scan.nextInt();

		System.out.println("Thanks For Rating Us With ");

		StudentSearchSort.studentAppRatingPrint(noofstars);

		}

}


