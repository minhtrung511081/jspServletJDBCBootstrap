package com.minhtrung.model;

import java.sql.Timestamp;

public class RoleModel extends AbstracModel{
	private String code;
	private String name;

	public String getCode() {  
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
