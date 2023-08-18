import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestUpdate {

	public static void main(String[] args) {
		Driver driver;// static method of drivermanager
		try {
			driver=new Driver();
			DriverManager.registerDriver(driver);// register driver with drivemanager
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connected");
			 Statement statement = connection.createStatement(); // statmenet is interface
			String query1 = "UPDATE customer Set name='Ronaldo',age=40,email='shivamgt821@gmail.com' WHERE name = 'Shivam'" ;
			int res1 = statement.executeUpdate(query1);
//			boolean  res1 = statement.execute(query1);
			System.out.println(res1);
			
			connection.close();
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		
		}
	}

	}


