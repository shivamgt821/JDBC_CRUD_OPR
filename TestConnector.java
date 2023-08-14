import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class TestConnector {

	public static void main(String[] args) {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);// register driver with driver manager
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connected");
			 Statement statement = connection.createStatement(); // Statement is interface
			String query1 = "INSERT INTO customer(id,name,email,age,addres) VALUES (3,'Messi','messi@gmail.com',37,'Argentina')";
			boolean res1 = statement.execute(query1);
			System.out.println(res1);
			
			connection.close();
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		
		}
	}

}
