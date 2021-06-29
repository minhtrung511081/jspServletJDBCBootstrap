package com.minhtrung.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.minhtrung.dao.ICategoryDAO;
import com.minhtrung.model.CategoryModel;
import com.minhtrung.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDAO;
	
	
	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDAO.findAll();
	}

}
