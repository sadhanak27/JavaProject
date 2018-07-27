package com.deloitte.cui;

import com.deloitte.daos.UserDAO;

public class MainClass {

	public static void main(String[] args) {
		UserDAO udao = new UserDAO();
		User user = new User(1,"Sadhana","Sadhana","Kumar","pass","E");
		
		udao.save(user);
		

	}

}
