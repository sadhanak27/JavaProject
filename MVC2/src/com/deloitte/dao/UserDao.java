package com.deloitte.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;




public class UserDao implements Dao<User> {

	@Override
	public User get(long id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public void validate(User user) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		//Load or register a JDBC driver
		
			Connection conn;
			try {
				Context initCtx = new InitialContext();
				 
				DataSource ds = (DataSource)initCtx.lookup("java:comp/env/jdbc/TeamDB");

				conn = ds.getConnection();
				conn.close();
				
				
				ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
				ps.setInt(1,user.getId());
				ps.setString(2, user.getUserName());
				ps.setString(3, user.getFirstName());
				ps.setString(4, user.getLastName());
				ps.setString(5, user.getPasswd());
				ps.setString(6, user.getStatus());
				
				ps.executeUpdate();
			} catch (NamingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			try {
				if(ps!=null && !ps.isClosed()) {
				ps.close();}
				if(connection!= null && !connection.isClosed()) {
				connection.close();}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
	

	@Override
	public void update(User t, String[] params) {
		
	}

	@Override
	public void delete(User t) {
		
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

}
