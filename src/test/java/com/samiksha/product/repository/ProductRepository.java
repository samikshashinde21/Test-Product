package com.samiksha.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samiksha.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
