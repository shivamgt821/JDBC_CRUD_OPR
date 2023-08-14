package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnector2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//full qualify name of driver
			String url = "jdbc:mysql://localhost:3306/wakanda";
			Connection connection = DriverManager.getConnection(url,"root","root");
			System.out.println("connected");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
  }
}
