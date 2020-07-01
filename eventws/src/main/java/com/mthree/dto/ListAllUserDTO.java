package com.mthree.dto;

public class ListAllUserDTO {

	private int userId;
	
	private String userName;

	public ListAllUserDTO(int userId,String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int  getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "ListAllUserDTO [ userId="+ userId+ "userName=" + userName + "]";
	}
	
}
