package com.deloitte.cui;

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
		return userName;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPasswd() {
		return passwd;
	}



	public String getStatus() {
		return status;
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



