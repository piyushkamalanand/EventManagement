package com.mthree.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.dto.ListAllEventDTO;
import com.mthree.dto.ListAllUserDTO;
import com.mthree.dto.ListUsersAttendingEventDTO;

import com.mthree.dto.IndividualEventDTO;
import com.mthree.dto.IndividualUserDTO;
import com.mthree.service.EventManagementService;

@RestController
public class EventManagementRestController {
	
	@Autowired
	private EventManagementService eventManagementService;
	
	@GetMapping("/events")
	public List<ListAllEventDTO> getListOfEvents(){
		return eventManagementService.loadEvents();
	}
	
	
	
	@GetMapping("/events/{eventId}")
	public List<IndividualEventDTO> getEvents(@PathVariable("eventId") int eventId){
		return eventManagementService.loadIndividualEvent(eventId);
	}
	
	
	@PostMapping(value = "/events/{eventId}")
	   public int put(@PathVariable("eventId") int  eventId,@RequestBody String eventAddress) { 
	      
		return eventManagementService.editEventAddressByEventId(eventId,eventAddress);
		
	   }
	
	
	@RequestMapping(value = "/events/{eventId}", method = RequestMethod.DELETE)
	   public int delete(@PathVariable("eventId") int  eventId) { 
	      
		return eventManagementService.deleteByEventId(eventId);
		
	   }
	
	
	
	@PostMapping(value = "/events/users/addusers")
	   public int addUser(@RequestParam(value="eventId") int eventId,@RequestParam(value="userId") int userId) { 
	      
		int addUsers = 0;
		addUsers = eventManagementService.addUserByUserId(eventId,userId);
		
		return addUsers;
		
	   }
	
	
	
	@GetMapping("/events/usersAttending/{eventId}")
	public List<ListUsersAttendingEventDTO> getUserAttendingEvent(@PathVariable("eventId") int eventId){
		return eventManagementService.loadUsersAttendingEvent(eventId);
	}
	
	
	
	
	@RequestMapping(value = "/events/deleteUser/{eventId}/{userId}", method = RequestMethod.DELETE)
	   public int deleteUserFromEvents(@PathVariable("eventId") int  eventId,@PathVariable("userId") int  userId) { 
	      
		return eventManagementService.deleteUserFromEventById(eventId,userId);
		
	   }
	
	
	
	@GetMapping("/events/users")
	public List<ListAllUserDTO> getListOfUsers(){
		return eventManagementService.loadUsers();
	}
	
	
	
	@GetMapping("/events/users/{userId}")
	public List<IndividualUserDTO> getUsers(@PathVariable("userId") int userId){
		return eventManagementService.loadIndividualUser(userId);
	}
	
	
	
	@RequestMapping(value = "/events/users/{userId}", method = RequestMethod.DELETE)
	   public int deleteUser(@PathVariable("userId") int  userId) { 
	      
		return eventManagementService.deleteByUserId(userId);
		
	   }
	
	
	
	@RequestMapping(value = "/events/users/{userId}", method = RequestMethod.PUT)
	   public int putUser(@PathVariable("userId") int  userId,@RequestBody int phoneNumber) { 
	      
		return eventManagementService.editPhoneNumberByUserId(userId,phoneNumber);
		
	   }
}
