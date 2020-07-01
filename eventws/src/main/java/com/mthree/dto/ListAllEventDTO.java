package com.mthree.dto;

public class ListAllEventDTO {

	private int eventId;
	
	private String eventName;
	
	public ListAllEventDTO(int eventId,String eventName) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	@Override
	public String toString() {
		return "ListAllEventDTO [eventId="+eventId +"eventName=" + eventName ;
	}
	
}
