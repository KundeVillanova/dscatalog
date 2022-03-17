package com.springcamp.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcamp.dscatalog.entities.Category;
import com.springcamp.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		
		return repository.findAll();
	}

}