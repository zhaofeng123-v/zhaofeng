package com.sbs.web.model;

public class UserModel {
	private String username;
	private String password;
	private String JSESSIONID;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJSESSIONID() {
		return JSESSIONID;
	}
	public void setJSESSIONID(String jSESSIONID) {
		JSESSIONID = jSESSIONID;
	}
	
	
}
