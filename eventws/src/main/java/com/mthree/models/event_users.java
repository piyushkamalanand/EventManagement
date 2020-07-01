package com.mthree.models;

public class event_users {

	private int eventseventId;
	
	private int usersuserId;

	public event_users(int eventseventId, int usersuserId) {
		super();
		this.eventseventId = eventseventId;
		this.usersuserId = usersuserId;
	}

	public int getEventseventId() {
		return eventseventId;
	}

	public void setEventseventId(int eventseventId) {
		this.eventseventId = eventseventId;
	}

	public int getUsersuserId() {
		return usersuserId;
	}

	public void setUsersuserId(int usersuserId) {
		this.usersuserId = usersuserId;
	}
	
	
	
}
