package com.api.path.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.path.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
