package com.adactin.baseclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/student_detail";
		
		String username="root";
		String password="root";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		String query = "select*from students";
		ResultSet reslt = stmt.executeQuery(query);
		/*while (reslt.next()) {
			
			String col1 = reslt.getString(2);
			System.out.println(col1+" ");
			*/
			while (reslt.next()) {
				String string = reslt.getString(3);
				System.out.println(string);
				
			}
			
		}
		
		

	}


