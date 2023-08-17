import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM customer";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
			System.out.println("id of customer = "+resultSet.getInt(1));
			System.out.println("name of customer = "+resultSet.getString(2)); // method is used to access the data from database
			System.out.println("email of customer = "+resultSet.getString(3)); // method is used to access the data from database
			System.out.println("age of customer = "+resultSet.getInt(4));	// method is used to access the data from database
			System.out.println("address of customer = "+resultSet.getString(5));// method is used to access the data from database
			System.out.println("-----------------------------------------");
			}
			connection.close();
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
