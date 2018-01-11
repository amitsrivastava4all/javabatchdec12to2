package com.brainmentors.onlineshop.user.view;

import java.util.Scanner;

import com.brainmentors.onlineshop.user.dto.UserDTO;
import com.brainmentors.onlineshop.user.helper.UserOperations;
import com.brainmentors.onlineshop.utils.IValidation;
import com.brainmentors.onlineshop.utils.Util;
import com.brainmentors.onlineshop.utils.Validation;

public class UserView  implements IValidation{
		
		public void register() {
			String userid = null;
			Scanner scanner= Util.getScanner();
			while(true) {
			System.out.println("Enter the UserName");
			userid = scanner.next();
			if(Validation.isNotBlank(userid) && Validation.minChars(userid, USERID_MINCHARS)) {
				break;
			}
			else {
				System.out.println("UserName Can't be Blank or Not Less than "+USERID_MINCHARS+" Chars");
			}
			}
			System.out.println("Enter the Password");
			String password = scanner.next();
			System.out.println("Enter the Full Name");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter the Address");
			//scanner.nextLine();
			String address = scanner.nextLine();
			UserDTO userDTO = new UserDTO(userid, password, name, address);
			if(UserOperations.addNewUser(userDTO)) {
				System.out.println("Register Done...");
			}
			else {
				System.out.println("Can't Register User Already Exist");
			}
			
		
		}
		
		public void login() {
			
		}
}
