package com.springrestservices.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springrestservices.app.services.UserDetailsServices;
import com.springrestservices.app.services.entity.Users;

@Repository("userDetailsServices")
@Service("userDetailsServices")
public class UserDetailsServicesImpl implements UserDetailsServices {

	/**
	 * Return All User Detials
	 */
	@Override
	public List<Users> getAllUsersDetails() {
		System.out.println(getUsersDetails().size());
		return getUsersDetails();
	}

	/**
	 * Create Static User LIst
	 * 
	 * @return
	 */
	private List<Users> getUsersDetails() {
		List<Users> usersList = new ArrayList<>();
		usersList.add(new Users(001, "USER ONE", "USERONEADDRES"));
		usersList.add(new Users(001, "USER TWO", "USERTWOADDRES"));
		usersList.add(new Users(001, "USER THREE", "USERTHREEADDRES"));
		usersList.add(new Users(001, "USER FOUR", "USERFOURADDRES"));
		usersList.add(new Users(001, "USER FIVE", "USERFIVEADDRES"));
		return usersList;
	}

}
