package com.trainticket.bookticketController;

import java.util.Date;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainticket.dto.BookedTicket;
import com.trainticket.dto.FillBookingInfo;

@RestController
public class BookTicketController {

	@PostMapping(
			value="/ticket",
			produces = {"application/xml","application/json"},
			consumes = {"application/xml","application/json"}
			)
	public ResponseEntity<BookedTicket> bookTicket(@RequestBody FillBookingInfo info){
		System.out.println(info); 
		BookedTicket ticket=new BookedTicket();
		ticket.setPnr(UUID.randomUUID().toString());
		ticket.setName(info.getFirst_name()+" "+info.getLast_name());
		ticket.setCoach_no("B1");
		ticket.setSeat_number(20);
		ticket.setBirth("Upper_Birth");
		ticket.setSource(info.getSource_station());
		ticket.setDestination(info.getDestination_station());
		ticket.setJourney_start_date(info.getJorney_date());
		ticket.setJourney_end_date(info.getJorney_date());
		ticket.setKilometer(300);
		
		return new ResponseEntity<BookedTicket>(ticket,HttpStatus.CREATED);
		
		
	}
}
