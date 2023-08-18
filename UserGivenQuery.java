import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class UserGivenQuery {
	public static void main(String[] args) throws IOException {
		Scanner scn  = new Scanner(System.in);
		try {
			System.out.println("Enter the query ");
			BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
			String query = reader.readLine();
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/wakanda";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			
			if(statement.execute(query)) {
				ResultSet resultSet = statement.getResultSet();
			while(resultSet.next()) {
			System.out.println("id of customer = "+resultSet.getInt(1));
			System.out.println("name of customer = "+resultSet.getString(2)); 
			System.out.println("email of customer = "+resultSet.getString(3)); 
			System.out.println("age of customer = "+resultSet.getInt(4));	
			System.out.println("address of customer = "+resultSet.getString(5));
			System.out.println("-----------------------------------------");
			 }
			}
			else {
				System.out.println("Data updated Successfully");
			}
			connection.close();
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
