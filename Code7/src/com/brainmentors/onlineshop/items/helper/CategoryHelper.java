package com.brainmentors.onlineshop.items.helper;

import java.util.ArrayList;

import com.brainmentors.onlineshop.items.CategoryDTO;
import com.brainmentors.onlineshop.items.ItemDTO;

public class CategoryHelper {
	
	public CategoryDTO addAndBindCategory(String name, ArrayList<ItemDTO> itemList) {
		CategoryDTO cate = new CategoryDTO();
		cate.setName(name);
		cate.setItems(itemList);
		return cate;
	}
	
	public ArrayList<CategoryDTO> loadCategory() {
		ItemHelper helper = new ItemHelper();
		ArrayList<CategoryDTO> cateList = new ArrayList<CategoryDTO>();
		cateList.add(addAndBindCategory("Fruits", helper.loadFruitItems()));
		cateList.add(addAndBindCategory("FastFood", helper.loadFastFoodItems()));
		return cateList;
	}

}
