package com.minhtrung.dao;

import java.util.List;

import com.minhtrung.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel>{
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
}
