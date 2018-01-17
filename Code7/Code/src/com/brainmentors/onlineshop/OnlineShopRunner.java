package com.brainmentors.onlineshop;

import java.util.Scanner;

import com.brainmentors.onlineshop.user.view.UserView;
import com.brainmentors.onlineshop.utils.Util;

public class OnlineShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserView userView = new UserView();
		while(true) {
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		Scanner s = Util.getScanner();
		int choice = s.nextInt();
		if(choice == 1) {
			userView.register();
		}
		else if(choice == 2){
			userView.login();
		}
		else
		if(choice ==3) {	
			System.out.println("Thanks for Using...");
			break;
		}
		else {
			System.out.println("Invalid Choice...");
		}
		}
	}

}
