import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String pass = "root";
			Connection connection = DriverManager.getConnection(url,user,pass);
			String query = "Delete from customer  WHERE id  = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, 2);
			
			int res = ps.executeUpdate();
			System.out.println("no of rows added = "+res);
			
			connection.close(); 
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	// --> ctrl n --> mavan project --> maven project--> next--> select box create a symble-->next--> Group id com.shivam.--> Artifact id- VisitorDatamanagement-->finish  

}
