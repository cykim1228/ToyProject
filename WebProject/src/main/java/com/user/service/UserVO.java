package com.user.service;

public class UserVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userBirth;
	private String userEmail;
	private int isAdmin;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Override
	public String toString() {
		return "userVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", userBirth=" + userBirth + ", userEmail=" + userEmail + ", isAdmin=" + isAdmin + "]";
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
