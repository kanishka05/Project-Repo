package com.network.social.repositoryImpl;

import java.sql.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.network.social.model.User;
import com.network.social.repository.LoginServiceRepo;


public class LoginServiceRepoImpl implements LoginServiceRepo {

	private static final Logger log = LoggerFactory
			.getLogger(LoginServiceRepoImpl.class);
	private SessionFactory sessionFactory;
	
	private Session session;
	public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
	
	public boolean loginValidationRepo(String userName,String password){
		log.debug("in repo getting session");
		System.out.println("in repo getting session");
		System.out.println(session.getSessionFactory().getCurrentSession());
		System.out.println("session : : " +sessionFactory.getCurrentSession());
		log.debug("creating user objet");
		System.out.println("creating user objet");
		//User user=(User) session.createQuery("select * from user");
		//System.out.println("user is : "+user.getUserName());
		
		//log.debug("user is : "+user.getUserName());
		System.out.println("in dao");
		log.debug("retuirning true");
		return true;
		/*System.out.println("in repo method");
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
		return true;*/
		}
}
