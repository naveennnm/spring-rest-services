package com.springrestservices.app.services.entity;

/**
 * 
 * @author Naveen
 *
 */
public class Users {

	private int userId;
	private String userName;
	private String userAddress;
	/**
	 * User Constructor
	 * @param userId
	 * @param userName
	 * @param userAddress
	 */
	public Users(int userId, String userName, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	public Users() {
	
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
