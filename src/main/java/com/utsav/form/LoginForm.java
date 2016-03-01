package com.utsav.form;

import javax.validation.constraints.NotNull;

public class LoginForm {

	@NotNull
	private String userName;

	@NotNull
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", password=" + password
				+ "]";
	}

}
