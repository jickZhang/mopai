package com.it.bean.login.domain;
 
public class User {

	private String id;
	private String userName;
	private String loginName;

	public String getUserName() {
		return userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}