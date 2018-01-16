package com.brainmentors.onlineshop.user.helper;

import com.brainmentors.onlineshop.user.dto.UserDTO;
import com.brainmentors.onlineshop.utils.CommonConstants;
import com.brainmentors.onlineshop.utils.dto.MessageDTO;

public class UserOperations {
	static UserDTO userArray [] = new UserDTO[10];
	private static int index = 0;
	private UserOperations() {}
	public static boolean addNewUser(UserDTO userDTO) {
		MessageDTO messageDTO = isUserExist(userDTO,CommonConstants.REGISTER);
		if(messageDTO.getStatus()==null || messageDTO.getStatus()==CommonConstants.SUCCESS) {
		userArray[index] = userDTO;
		index++;
		return true;
		}
		return false;
	}
	public static MessageDTO isUserExist(UserDTO userDTO, int status) {
		MessageDTO messageDTO = new MessageDTO();
		if(userArray!=null && userArray.length>0) {
		
		for(UserDTO userObject : userArray) {
			if(userObject!=null) {
			if(status == CommonConstants.LOGIN) {
				if(userObject.getUserid().equals(userDTO.getUserid()) && userObject.getPassword().equals(userDTO.getPassword())) {
					//return true;
					messageDTO.setMessage("Welcome ");
					messageDTO.setUserName(userDTO.getUserid());
					messageDTO.setStatus(CommonConstants.SUCCESS);
					break;
				}
				else {
					//return false;
					messageDTO.setMessage("Invalid Userid or Password ");
					messageDTO.setUserName(userDTO.getUserid());
					messageDTO.setStatus(CommonConstants.FAIL);
				}
			}
			if(status == CommonConstants.REGISTER) {
			if(userObject.getUserid().equals(userDTO.getUserid())) {
				//return true;
				messageDTO.setMessage("User Found");
				messageDTO.setUserName(userDTO.getUserid());
				messageDTO.setStatus(CommonConstants.FAIL);
				break;
			}
			else {
				messageDTO.setMessage("User Not Found");
				messageDTO.setUserName(userDTO.getUserid());
				messageDTO.setStatus(CommonConstants.SUCCESS);
			}
			}
			}
		}
		}
		return messageDTO;
		//return false;
	}

}
