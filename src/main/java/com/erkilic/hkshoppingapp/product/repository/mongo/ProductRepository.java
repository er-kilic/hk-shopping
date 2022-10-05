package com.erkilic.hkshoppingapp.product.repository.mongo;

import com.erkilic.hkshoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
