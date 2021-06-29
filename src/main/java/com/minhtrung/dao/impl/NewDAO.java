package com.minhtrung.dao.impl;

import java.util.List;

import com.minhtrung.dao.INewDAO;
import com.minhtrung.mapper.NewsMapper;
import com.minhtrung.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO{
	
	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news (title, content, categoryid) VALUES(?, ?, ?)";
		return insert(sql, newModel.getTitle(),newModel.getContent(),newModel.getCategoryId());
	}
}
