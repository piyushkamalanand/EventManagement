package com.mthree.dto;

public class IndividualEventDTO {

private String eventName;
	
	private double entryFee;
	
	private String eventAddress;
	
	private int seatsAvailable;
	
	public IndividualEventDTO(String eventName, double entryFee, String eventAddress, int seatsAvailable) {
		super();
		this.eventName = eventName;
		this.entryFee = entryFee;
		this.eventAddress = eventAddress;
		this.seatsAvailable = seatsAvailable;
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
	
	@Override
	public String toString() {
		return "IndividualEventDTO [eventName=" + eventName + ", entryFee=" + entryFee + ", eventAddress=" + eventAddress
				+ ", seatsAvailable=" + seatsAvailable + "]";
	}
}
