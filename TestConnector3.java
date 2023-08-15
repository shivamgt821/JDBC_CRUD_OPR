import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestConnector3 {

	public static void main(String[] args) {
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		
			FileInputStream file = new FileInputStream("mydbinfo.properties");
		
			Properties properties = new Properties();
			properties.load(file);
			String url = "jdbc:mysql://localhost:3306/wakanda";
			
			Connection connection = DriverManager.getConnection(url,properties);
			System.out.println("Connected");
		
		
	}
	catch(SQLException | IOException e) {
		
		e.printStackTrace();
		}
	}
	

}
