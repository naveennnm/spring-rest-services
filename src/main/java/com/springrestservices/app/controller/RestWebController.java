package com.springrestservices.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springrestservices.app.services.UserDetailsServices;
import com.springrestservices.app.services.entity.Users;


/**
 * \http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/
 *
 * @author Naveen
 *
 */

@RestController
@RequestMapping("/api/userApp")
public class RestWebController {
	@Autowired
	UserDetailsServices userDetailsServices;

	/**
	 *
	 * @return
	 */
	@ResponseBody
	@CrossOrigin
	@GetMapping(value = "/welcome")
	public String welcomeRequest() {
		System.out.println("WELCOME");

		return "Welcome";
	}

	/**
	 * Get All User Details
	 *
	 * @return List<Users>
	 */
	@ResponseBody
	@CrossOrigin
	@GetMapping(value = "/findAllUsers")
	public ResponseEntity<List<Users>> listAllUsers() {
		List<Users> usersList = userDetailsServices.getAllUsersDetails();
		if (usersList.isEmpty()) {
			return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);// You many decide to return
			// HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Users>>(usersList, HttpStatus.OK);
	}

	/**
	 * Create New User
	 *
	 * @param user
	 * @return
	 */
	@ResponseBody
	@CrossOrigin
	@PostMapping(value = "/createNewUser")
	public ResponseEntity<String> createUser(@RequestBody Users user) {
		System.out.println("HHHHHHH");
		System.out.println(user);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	/**
	 * Update User
	 *
	 * @param user
	 * @return
	 */
	@CrossOrigin
	@ResponseBody
	@PutMapping(value = "/updateUser", produces = "application/json")
	public Users updateUser(@RequestBody Users user) {
		// Update Code.
		return user;
	}

}
