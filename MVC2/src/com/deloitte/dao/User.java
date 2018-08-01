package com.deloitte.dao;

public class User {

	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String passwd;
	private String status;
	
	
	public User(int id, String userName, String firstName, String lastName, String passwd, String status) {
		this.id=id;
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.passwd=passwd;
		this.status=status;
	}
	
	
	
	public int getId() {
		return id;
	}



	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getPasswd() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	

}

