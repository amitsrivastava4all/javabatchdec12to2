package com.brainmentors.onlineshop.utils;

import java.util.Scanner;

public class Util {
	private static Scanner scanner= null;
	static{
		System.out.println("Scanner is Loaded Only Once...");
		scanner= new Scanner(System.in);
	}
	public static Scanner getScanner() {
		return scanner;
	}
}
