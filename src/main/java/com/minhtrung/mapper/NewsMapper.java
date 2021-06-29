package com.minhtrung.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.minhtrung.model.NewModel;

public class NewsMapper implements RowMapper<NewModel>{

	@Override
	public NewModel mapRow(ResultSet resultSet) {
		try {
			NewModel news = new NewModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			return news;
		} catch (SQLException e) {
			return null;
		}
		
		
	}
	
}
