package com.brainmentors.onlineshop.utils;

public class Validation {
	public static boolean isNotBlank(String value) {
		return (value!=null && value.trim().length()>0)?true:false;
	}
	public static boolean minChars(String value,int min) {
		return value.trim().length()>=min?true:false;
	}
}
