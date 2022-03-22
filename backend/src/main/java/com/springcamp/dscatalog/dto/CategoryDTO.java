package com.springcamp.dscatalog.dto;

import java.io.Serializable;
import com.springcamp.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	//dto é para trafego de dados
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public CategoryDTO () {	
	}
	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public CategoryDTO(Category entity) {
		this.id = entity.getID();
		this.name = entity.getName();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
