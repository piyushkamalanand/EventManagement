package com.mthree.dto;

public class IndividualUserDTO {

	private String userName;
	
	private int phoneNumber;

	private int eventId;
	public IndividualUserDTO(String userName, int phoneNumber,int eventId) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.eventId = eventId;
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

	public int geteventId() {
		return eventId;
	}

	public void seteventId(int eventId) {
		this.eventId = eventId;
	}
	
	@Override
	public String toString() {
		return "IndividualUserDTO [userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
