package com.mthree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.dto.ListAllEventDTO;
import com.mthree.dto.ListAllUserDTO;
import com.mthree.dto.ListUsersAttendingEventDTO;
import com.mthree.dto.IndividualEventDTO;
import com.mthree.dto.IndividualUserDTO;


import com.mthree.repositories.EventManagementRepository;

@Service
public class EventManagementService {

	@Autowired 
	private EventManagementRepository eventManagementRepository;
	
	
	public List<ListAllEventDTO> loadEvents() {
		
		return eventManagementRepository.findEvent();
	
	}
	
	
	
	public List<IndividualEventDTO> loadIndividualEvent(int eventId) {
		
		return eventManagementRepository.findIndividualEvent(eventId);
	
	}
	
	
	
	public int deleteByEventId(int eventId)
	{
		return eventManagementRepository.deleteEvent(eventId);
	}
	
	
	
	public int editEventAddressByEventId(int eventId,String eventAddress)
	{
		return eventManagementRepository.editEventAddressByEventId(eventId,eventAddress);
	}
	
	
	
	public int addUserByUserId(int eventId,int userId)
	{
		int res = eventManagementRepository.addUsersInEvent(eventId,userId);
		
		int k = eventManagementRepository.addUsersInEvents(eventId,userId);
		
		return res;
	}
	
	
	
	public List<ListUsersAttendingEventDTO> loadUsersAttendingEvent(int eventId)
	{
		return eventManagementRepository.listUserAttendingEvent(eventId);
	}
	
	
	
	public int deleteUserFromEventById(int eventId,int userId)
	{
		return eventManagementRepository.deleteUserFromEvent(eventId,userId);
	}
	
	
	
	public List<ListAllUserDTO> loadUsers() {
		
		return eventManagementRepository.findUser();
	
	}
	
	
	
	public List<IndividualUserDTO> loadIndividualUser(int userId) {
		
		return eventManagementRepository.findIndividualUser(userId);
	
	}
	
	
	
	public int deleteByUserId(int userId)
	{
		return eventManagementRepository.deleteUser(userId);
	}
	
	
	
	public int editPhoneNumberByUserId(int eventId,int phoneNumber)
	{
		return eventManagementRepository.editPhoneNumberByUserId(eventId,phoneNumber);
	}
	
	
	
}
