import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/university";
		String USER_NAME="root";
		String PASSWORD="Teju@winnie2001";
//		String CREATE_STUDENT_QUERY=
//				"CREATE TABLE STUDENT3(ID INT, NAME VARCHAR(20), MARKS INT);";
//		String INSERT_STUDENT_QUERY=
//				"INSERT INTO STUDENT3 VALUES (1, 'TEJU', 95);";
//		String UPDATE_STUDENT_QUERY=
//				"UPDATE STUDENT3 SET NAME='TEJASWINI' WHERE NAME='TEJU';";
		String DELETE_STUDENT_QUERY=
				"DELETE FROM STUDENT3 WHERE ID=1;";
		try {
			
			//1. Load and Register Driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
//			FQCN(Fully Qualified Class NAme) - Canonical Name
			System.out.println("Driver loaded and registed !");
			
			//2. Establish connection with database.
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection established at = "+con);
			
			//3. create Statement object
			Statement stmt=con.createStatement();
			
			//4.Send and execute query
//			stmt.execute(CREATE_STUDENT_QUERY);
//			int rows=stmt.executeUpdate(INSERT_STUDENT_QUERY);
//			int rows=stmt.executeUpdate(UPDATE_STUDENT_QUERY);
			int rows=stmt.executeUpdate(DELETE_STUDENT_QUERY);
			
//			System.out.println("Student3 table created successfully !");
			System.out.println(rows+" rows affected.");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to establidh connection");
			e.printStackTrace();
		}
	}

}
