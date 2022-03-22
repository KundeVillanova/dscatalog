package com.springcamp.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcamp.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 

}
