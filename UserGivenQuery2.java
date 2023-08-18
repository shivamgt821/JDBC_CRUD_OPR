import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UserGivenQuery2 {

	public static void main(String[] args) {
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			Scanner scn = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			System.out.println("Type your Query");
			String query = scn.nextLine();
			boolean res = statement .execute(query);
			ResultSet resultSet = statement.getResultSet(); // read the data from database
			if(res) {
				while(resultSet.next()) {
					System.out.println("id of customer = "+resultSet.getInt(1));
					System.out.println("name of customer = "+resultSet.getString(2)); // method is used to access the data from database
					System.out.println("email of customer = "+resultSet.getString(3)); // method is used to access the data from database
					System.out.println("age of customer = "+resultSet.getInt(4));	// method is used to access the data from database
					System.out.println("address of customer = "+resultSet.getString(5));
		
				}
			}
			else{
				System.out.println("perfomred");
			}
			connection.close();
		}
				
				catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
