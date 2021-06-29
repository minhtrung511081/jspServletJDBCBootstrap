package com.minhtrung.dao;

import java.util.List;

import com.minhtrung.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
}
