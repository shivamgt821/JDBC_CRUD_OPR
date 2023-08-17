import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert {

	public static void main(String[] args) {
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/wakanda";
				String user = "root";
				String password = "root";
				Connection connection = DriverManager.getConnection(url,user,password);
				Statement statement = connection.createStatement();
				
			statement.addBatch("INSERT INTO customer VALUES(110,'Raman','raman10@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(111,'Raman','raman20@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(112,'Raman','raman30@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(113,'Raman','raman40@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(114,'Raman','raman50@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(115,'Raman','raman60@gmail.com',24,'Newyork'");
			statement.addBatch("INSERT INTO customer VALUES(116,'Raman','raman70@gmail.com',24,'Newyork'");
			
			int res[]=statement.executeBatch();
			System.out.println(res.length);
			connection.close();
			}
			
			
			
			catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	
	}
}
