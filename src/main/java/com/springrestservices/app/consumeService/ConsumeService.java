package com.springrestservices.app.consumeService;



import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.springrestservices.app.services.entity.Users;

/**
 * 
 * @author Naveen
 *
 */ 
public class ConsumeService {
	public static final String REST_SERVICE_URI = "http://localhost:8080/springrestservices/api/userApp/";

	public static void testConsumeGetservice() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(REST_SERVICE_URI + "welcome", String.class);
		System.out.println(response + " - testConsumeGetservice");
	}

	public static void getAllUsers() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(REST_SERVICE_URI + "findAllUsers", String.class);
		System.out.println(response + " - testConsumeGetserviceWithParam");
	}
}
