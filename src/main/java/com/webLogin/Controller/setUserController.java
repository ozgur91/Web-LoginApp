package com.webLogin.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webLogin.DAO.LoginDao;
import com.webLogin.model.Loginbean;

/**
 * Servlet implementation class setUserController
 */
@WebServlet("/setUser")
public class setUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginDao loginDao;
	
	public void init() {
		loginDao = new LoginDao();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setUserController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		authenticate(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = (int)Math.random();
		System.out.println(a);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_base", "root", "admin");
			
			PreparedStatement st = conn.prepareStatement("insert into user_info values(?,?,?,?,?)");
			
			st.setInt(1, a);
			st.setString(2, request.getParameter("first_name"));
			st.setString(3, request.getParameter("last_name"));
			st.setString(4, request.getParameter("username"));
			st.setString(5, request.getParameter("passwort"));
			
			st.executeUpdate();
			st.close();
			conn.close();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
		disp.forward(request, response);
		
		
	}
	
	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("passwort");
		Loginbean loginBean = new Loginbean();
		loginBean.setUsername(username);
		loginBean.setPasswort(password);
		
		try {
			if(loginDao.validate(loginBean)) {
				RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
				disp.forward(request, response);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
