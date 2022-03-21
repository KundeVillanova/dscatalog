package com.springcamp.dscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springcamp.dscatalog.dto.CategoryDTO;
import com.springcamp.dscatalog.entities.Category;
import com.springcamp.dscatalog.repositories.CategoryRepository;
import com.springcamp.dscatalog.services.exceptions.EntityNotFoundExceptions;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository repository;
	
	@Transactional (readOnly = true)
	public List<CategoryDTO> findAll(){	
		List<Category> list = repository.findAll();		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional (readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundExceptions("Entity not found"));
		return new CategoryDTO(entity);
	}
	@Transactional 
	public CategoryDTO insert(CategoryDTO dto) {
		Category entity = new Category();
		entity.setName(dto.getName());
		entity = repository.save(entity);
			return new CategoryDTO(entity);
	}
}
