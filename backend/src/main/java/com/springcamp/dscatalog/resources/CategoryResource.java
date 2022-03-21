package com.springcamp.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springcamp.dscatalog.dto.CategoryDTO;
import com.springcamp.dscatalog.services.CategoryServices;

@RestController
@RequestMapping (value="/categories")
public class CategoryResource {	
	
	@Autowired
	private CategoryServices service;
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
		CategoryDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
