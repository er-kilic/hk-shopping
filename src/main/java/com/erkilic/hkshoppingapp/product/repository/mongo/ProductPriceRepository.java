package com.erkilic.hkshoppingapp.product.repository.mongo;

import com.erkilic.hkshoppingapp.product.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String> {
}
