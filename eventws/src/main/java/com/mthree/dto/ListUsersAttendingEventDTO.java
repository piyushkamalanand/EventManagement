package com.mthree.dto;

public class ListUsersAttendingEventDTO {

	
	private int userId;
	
	private String userName;
	
	private int phoneNumber;

	public ListUsersAttendingEventDTO(int userId, String userName, int phoneNumber) {
		super();
		this.userId = userId;
		//this.eventId = eventId;
		this.userName = userName;
		//this.eventName = eventName;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

//	public int getEventId() {
//		return eventId;
//	}
//
//	public void setEventId(int eventId) {
//		this.eventId = eventId;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public String getEventName() {
//		return eventName;
//	}
//
//	public void setEventName(String eventName) {
//		this.eventName = eventName;
//	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ListUsersAttendingEvent [userId=" + userId + ", userName=" + userName
				+  ", phoneNumber=" + phoneNumber + "]";
	}
	
}
