package com.webLogin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webLogin.model.Loginbean;

public class LoginDao {

	public boolean validate(Loginbean loginBean) throws ClassNotFoundException{

		boolean status = false;
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/user_base";
		String uname ="root";
		String pass ="admin";
		
		try(Connection conn = DriverManager.getConnection(url,uname,pass);){
			
			PreparedStatement prepStat = 
			conn.prepareStatement("select * from user_info where username= ? and passwort = ?");
			prepStat.setString(1, loginBean.getUsername());
			prepStat.setString(2, loginBean.getPasswort());
			
			System.out.println(prepStat);
			ResultSet rs = prepStat.executeQuery();
			status = rs.next();
			
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
		return status;
	}
}
