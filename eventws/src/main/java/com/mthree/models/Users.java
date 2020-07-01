package com.mthree.models;


import javax.persistence.*;

@Entity
public class Users {

	@Id
	@GeneratedValue
	private int userId;
	
	private String userName;
	
	private int phoneNumber;
	
	@ManyToOne
	private Event events;

	public Users(int userId, String userName, int phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
