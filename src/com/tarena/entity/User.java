package com.tarena.entity;

public class User {
     private String userName;
     private String password;
     
     public User(){
     	 System.out.println(" µ¿˝ªØUser");
     }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("…Ë÷√userName");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
     
	
}
