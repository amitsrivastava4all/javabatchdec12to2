package com.brainmentors.onlineshop.items;

import java.util.ArrayList;

public class CategoryDTO {
	private String name;
	private ArrayList<ItemDTO> items = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ItemDTO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemDTO> items) {
		this.items = items;
	}
	
	

}
