package com.example.micro2.repository;

import java.util.List;

import com.example.micro2.entity.Category;
import com.example.micro2.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
    public List<Product> findByCategory(Category category);
}
