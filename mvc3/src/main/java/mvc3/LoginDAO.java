package mvc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "sri08#fitness";

    public boolean isValidUser(User user) {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM table1 WHERE username = ? AND password = ?"); 
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet resultSet = statement.executeQuery();
             // User found if result set has at least one row
            if(resultSet.next()) {
            	return true;
            }
             
    } catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
		return false;
   }
}
