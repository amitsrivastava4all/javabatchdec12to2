package com.brainmentors.onlineshop.items.view;

import java.util.ArrayList;

import com.brainmentors.onlineshop.items.CategoryDTO;
import com.brainmentors.onlineshop.items.ItemDTO;
import com.brainmentors.onlineshop.items.helper.CategoryHelper;

public class ItemView {
	
	public void printItems() {
		CategoryHelper ch= new CategoryHelper();
		ArrayList<CategoryDTO> cateList= ch.loadCategory();
		for(CategoryDTO cateDTO : cateList) {
			ArrayList<ItemDTO> itemList = cateDTO.getItems();
			System.out.println("CAT NAME "+cateDTO.getName());
			System.out.println("\t NAME      PRICE      QT");
			for(ItemDTO itemDTO: itemList) {
				System.out.println("\t "+itemDTO.getName()+" "+itemDTO.getPrice()+" "+itemDTO.getQuantity());
			}
		}
	}
	public static void main(String[] args) {
		ItemView itemView = new ItemView();
		itemView.printItems();
	}

}
