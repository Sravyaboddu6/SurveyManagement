package com.survey.loginservice.pojo;

public class LoginPojo {
	private int id;
	private String username;
	private String password;

	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginPojo(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginPojo [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

}
