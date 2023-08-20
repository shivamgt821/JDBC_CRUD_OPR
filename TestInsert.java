import java.sql.SQLException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection =  DriverManager.getConnection(url,user,password);
			String query = "INSERT INTO customer Values(?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, 555); // setInt is used to assign the data
			ps.setString(2, "Passang");
			ps.setString(3, "passang@gmail.com");
			ps.setInt(4, 23);
			ps.setString(5, "West");
			
			int res = ps.executeUpdate();
			System.out.println("no of rows added = "+res);
			
			connection.close();
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
