package com.mthree;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mthree.dto.ListAllEventDTO;
import com.mthree.service.EventManagementService;


@SpringBootTest
class EventwsApplicationTests {

	@Autowired
	private EventManagementService eventManagamentService;
	
	@Test
	void contextLoads() {
		
		
		int i =  eventManagamentService.deleteByUserId(2);
		
		assertEquals(1,i);
	}

}
