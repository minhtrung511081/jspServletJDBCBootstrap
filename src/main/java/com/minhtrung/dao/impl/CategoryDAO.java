package com.minhtrung.dao.impl;

import java.util.List;

import com.minhtrung.dao.ICategoryDAO;
import com.minhtrung.mapper.CategoryMapper;
import com.minhtrung.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{
	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql,  new CategoryMapper());
	}

}
