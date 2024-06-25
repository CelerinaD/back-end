package com.sample.Beaches.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
