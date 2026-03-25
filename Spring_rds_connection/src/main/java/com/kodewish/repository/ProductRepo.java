package com.kodewish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewish.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
