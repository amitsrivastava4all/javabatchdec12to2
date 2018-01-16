package com.brainmentors.onlineshop.user.dto;

public class UserDTO {
	private String userid;
	private String password;
	private String name;
	private String address;
	public UserDTO(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	public UserDTO(String userid, String password, String name , String address) {
		this.userid = userid;
		this.password = password;
		this.name  = name;
		this.address = address;
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
