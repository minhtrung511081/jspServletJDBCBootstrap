package com.minhtrung.service;

import java.util.List;

import com.minhtrung.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);
	NewModel save(NewModel newModel);
	
}
