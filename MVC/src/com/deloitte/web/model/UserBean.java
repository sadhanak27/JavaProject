package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
  
	private String firstName;
	private String lastName;
	
		
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean authenticate(String userName, String password){
		if (userName != null && password != null) {
			if (userName.equalsIgnoreCase("Sadhana") && password.equals("pass")) {
				firstName = "Sadhana";
				lastName = "Kumar";
						
				return true;
			}
			else {
				return false;
			}
		}
	
	return false;
}

}
