package com.erkilic.hkshoppingapp.product.repository;

import com.erkilic.hkshoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
