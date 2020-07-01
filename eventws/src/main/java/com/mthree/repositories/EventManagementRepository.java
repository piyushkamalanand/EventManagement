package com.mthree.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mthree.dto.ListAllEventDTO;
import com.mthree.dto.ListAllUserDTO;
import com.mthree.dto.ListUsersAttendingEventDTO;
import com.mthree.dto.IndividualEventDTO;
import com.mthree.dto.IndividualUserDTO;
import com.mthree.models.Event;


@Repository
public interface EventManagementRepository extends JpaRepository<Event, Integer>{

	@Query("SELECT new com.mthree.dto.ListAllEventDTO(e.eventId,e.eventName) from Event e")
	public List<ListAllEventDTO> findEvent();
	
	
	
	@Query("SELECT new com.mthree.dto.IndividualEventDTO(e.eventName,e.entryFee,e.eventAddress,e.seatsAvailable) from Event e where eventId=:eventId")
	public List<IndividualEventDTO> findIndividualEvent(@Param("eventId") int eventId);
	
	
	
	@Query("DELETE from Event WHERE eventId=:eventId")
	@Modifying
	@Transactional
	public int deleteEvent(@Param("eventId") int eventId);
	
	
	
	@Query("UPDATE Event e SET e.eventAddress=:eventAddress WHERE eventId=:eventId")
	@Modifying
	@Transactional
	public int editEventAddressByEventId(@Param("eventId") int eventId,@Param("eventAddress") String eventAddress);
	
	
	@Query(value="INSERT into event_users(eventeventId,usersuserId) values(:eventId,:userId)",nativeQuery=true)
	@Modifying
	@Transactional
	public int addUsersInEvent(@Param("eventId") int eventId,@Param("userId") int userId);
	
	
	@Query(value="INSERT into Users(events.eventId) values(:eventId) where userId=:userId",nativeQuery=true)
	@Modifying
	@Transactional
	public int addUsersInEvents(@Param("eventId") int eventId,@Param("userId") int userId);
	
	
	
	@Query("SELECT new com.mthree.dto.ListUsersAttendingEventDTO(u.userId,u.userName,u.phoneNumber) from Users u where events.eventId=:eventId")
	public List<ListUsersAttendingEventDTO> listUserAttendingEvent(@Param("eventId") int eventId);
	
	
	
	@Query("DELETE from Users where events.eventId=:eventId and userId=:userId")
	@Modifying
	@Transactional
	public int deleteUserFromEvent(@Param("eventId") int eventId,@Param("userId") int userId);
	
	
	
	@Query("SELECT new com.mthree.dto.ListAllUserDTO(u.userId,u.userName) from Users u")
	public List<ListAllUserDTO> findUser();
	
	
	
	@Query("SELECT new com.mthree.dto.IndividualUserDTO(u.userName,u.phoneNumber,u.events.eventId) from Users u where userId=:userId")
	public List<IndividualUserDTO> findIndividualUser(@Param("userId") int userId);
	
	
	
	@Query("DELETE from Users WHERE userId=:userId")
	@Modifying
	@Transactional
	public int deleteUser(@Param("userId") int userId);
	
	
	
	@Query("UPDATE Users u SET u.phoneNumber=:phoneNumber WHERE userId=:userId")
	@Modifying
	@Transactional
	public int editPhoneNumberByUserId(@Param("userId") int eventId,@Param("phoneNumber") int phoneNumber);
	
}
