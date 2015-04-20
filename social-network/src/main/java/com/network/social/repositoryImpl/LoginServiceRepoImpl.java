package com.network.social.repositoryImpl;

import java.sql.*;

import com.network.social.model.User;
import com.network.social.repository.LoginServiceRepo;


public class LoginServiceRepoImpl implements LoginServiceRepo {

	public boolean loginValidationRepo(String userName,String password){
		System.out.println("in repo method");
		Connection conn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/social-network","root","root");
			stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT * from user";
		      ResultSet rs = stmt.executeQuery(sql);
		      while(rs.next()){
		          //Retrieve by column name
		          int id  = rs.getInt("id");
		          String username = rs.getString("userName");
		          String pasword = rs.getString("password");

		          //Display values
		          System.out.print("ID: " + id);
		          System.out.print(", First: " + username);
		          System.out.println(", Last: " + pasword);
		       }
		      rs.close();
		      stmt.close();
		      conn.close();
			
		}
		catch(Exception e){
			System.out.println("caught exception : : : : : "+e);
			return false;
		}
		return true;
		}
}
