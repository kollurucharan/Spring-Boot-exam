package com.pack.books.models;

public class LoginClass {
	private int user_id;
	private String userName;
	private String passWord;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "LoginClass [user_id=" + user_id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
