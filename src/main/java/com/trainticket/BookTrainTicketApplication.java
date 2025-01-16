package com.trainticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookTrainTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookTrainTicketApplication.class, args);
		String url="http://localhost:8080/employee/getAll";
		RestTemplate temp=new RestTemplate();
		  ResponseEntity<Object> forEntity = temp.getForEntity(url, Object.class);
		  Object body = forEntity.getBody();
		  System.out.println(body);
                System.out.println("new line added");
				System.out.println("3rd commit");
	} 

}
