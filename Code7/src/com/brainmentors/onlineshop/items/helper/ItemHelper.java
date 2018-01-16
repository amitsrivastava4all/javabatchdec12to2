package com.brainmentors.onlineshop.items.helper;

import java.util.ArrayList;

import com.brainmentors.onlineshop.items.ItemDTO;

public class ItemHelper {
	int id ;
	public ItemHelper() {
		id=100;
	}
	public ItemDTO addItem(String name, double price, int quantity) {
		
		ItemDTO item = new ItemDTO();
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setQuantity(quantity);
		id++;
		return item;
	}
	
	public ArrayList<ItemDTO> loadFruitItems() {
		ArrayList<ItemDTO> itemList = new ArrayList<>();
		itemList.add(addItem("Apple",20,100));
		itemList.add(addItem("Orange",25,200));
		itemList.add(addItem("Grapes",120,200));
		return itemList;
	}
	
	
	public ArrayList<ItemDTO> loadFastFoodItems() {
		ArrayList<ItemDTO> itemList = new ArrayList<>();
		itemList.add(addItem("Coke",50,100));
		itemList.add(addItem("Pizza",125,200));
		itemList.add(addItem("Burger",120,200));
		return itemList;
	}
	
}
