package com.brainmentors.onlineshop.user.helper;

import com.brainmentors.onlineshop.user.dto.UserDTO;

public class UserOperations {
	static UserDTO userArray [] = new UserDTO[10];
	private static int index = 0;
	private UserOperations() {}
	public static boolean addNewUser(UserDTO userDTO) {
		if(!isUserExist(userDTO)) {
		userArray[index] = userDTO;
		index++;
		return true;
		}
		return false;
	}
	public static boolean isUserExist(UserDTO userDTO) {
		for(UserDTO userObject : userArray) {
			if(userObject.getUserid().equals(userDTO.getUserid())) {
				return true;
			}
		}
		return false;
	}

}
