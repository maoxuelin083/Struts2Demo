package com.tarena.entity;

public class User {
     private String userName;
     private String password;
     
     public User(){
     	 System.out.println("ʵ����User");
     }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("����userName");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
     
	
}
