package dynamicCRUDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestMultiInsert2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection =  DriverManager.getConnection(url,user,password);
			String query = "INSERT INTO customer Values(?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, 3133); // setInt is used to assign the data
			ps.setString(2, "Passang");
			ps.setString(3, "shivpstp@gmail.com");
			ps.setInt(4, 23);
			ps.setString(5, "West");
			
			ps.addBatch();
			
			ps.setInt(1, 556688); // setInt is used to assign the data
			ps.setString(2, "Passang");
			ps.setString(3, "passcha@gmail.com");
			ps.setInt(4, 23);
			ps.setString(5, "West");
			
			ps.addBatch();
			
			ps.setInt(1, 5234555); // setInt is used to assign the data
			ps.setString(2, "Passang");
			ps.setString(3, "shitala@gmail.com");
			ps.setInt(4, 23);
			ps.setString(5, "West");
			
			ps.addBatch();
			
			int[] res = ps.executeBatch();
			System.out.println("no of rows added = "+res.length);
			
			
			connection.close();
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
