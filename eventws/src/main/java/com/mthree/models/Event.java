package com.mthree.models;

import javax.persistence.*;

import java.util.List;


@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private int eventId;
	
	private String eventName;
	
	private double entryFee;
	
	private String eventAddress;
	
	private int seatsAvailable;
	
	//private int numberOfUsers;
	
	@OneToMany
	private List<Users> users;

	public Event(int eventId, String eventName, double entryFee, String eventAddress, int seatsAvailable,
			List<Users> users) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.entryFee = entryFee;
		this.eventAddress = eventAddress;
		this.seatsAvailable = seatsAvailable;
		//this.numberOfUsers = numberOfUsers;
		this.users = users;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

//	public int getNumberOfUsers() {
//		return numberOfUsers;
//	}
//
//	public void setNumberOfUsers(int numberOfUsers) {
//		this.numberOfUsers = numberOfUsers;
//	}
	
	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

}
