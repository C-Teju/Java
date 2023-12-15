import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeTableJDBC {
	public static final String URL="jdbc:mysql://localhost:3306/university";
	public static final String USER_NAME="root";
	public static final String PASSWORD="Teju@winnie2001";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded and registed !");
			
			//2. Establish connection with database.
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection established at = "+con);
			
			System.out.println("Choose an option:-");
			System.out.println("1:Insert a query");
			System.out.println("2:Read the query");
			System.out.println("3:Update a query");
			System.out.println("4:Delete a query");
			System.out.println("5:Exit");
			int ch=sc.nextInt();
			switch (ch) {
			case 1 :
				insertEmpData(sc,con);
				break;
			case 2 :
//				readEmpData(sc,con);
				break;
			case 3 :
//				updateEmpData(sc,con);
				break;
			case 4:
//				deleteEmpData(sc,con);
				break;
			case 5 :
				break;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void insertEmpData(Scanner sc, Connection con) {
		PreparedStatement pstmt=con.prepareStatement(null);
	}
}