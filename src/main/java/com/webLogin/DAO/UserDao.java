package com.webLogin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.webLogin.model.User;

public class UserDao {
	
	public User getUser() {
		
		User nutzer = new User();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_base", "root", "admin");
			
			Statement st = conn.createStatement();
			
			ResultSet result = st.executeQuery(null);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}

}
