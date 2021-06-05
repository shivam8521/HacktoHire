package com.hackathon.book.model;

public class Users {

	private int id; 
	
	private String userName;
	
	

	private String password;
	
	private String roles;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roles
	 */
	public String getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}

	public Users(String userName, String password, String roles) {
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	
}
