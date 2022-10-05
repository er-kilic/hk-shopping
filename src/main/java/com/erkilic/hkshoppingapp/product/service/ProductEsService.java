package com.erkilic.hkshoppingapp.product.service;

import com.erkilic.hkshoppingapp.product.domain.Product;
import com.erkilic.hkshoppingapp.product.domain.es.CategoryEs;
import com.erkilic.hkshoppingapp.product.domain.es.CompanyEs;
import com.erkilic.hkshoppingapp.product.domain.es.ProductEs;
import com.erkilic.hkshoppingapp.product.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductEsService {

    private final ProductEsRepository productEsRepository;

    @Async
    public Mono<ProductEs> saveNewProduct(Product product) {
        return productEsRepository.save(
                ProductEs.builder()
                        .active(product.getActive())
                        .code(product.getCode())
                        .description(product.getDescription())
                        .features(product.getFeatures())
                        .id(product.getId())
                        .name(product.getName())
                        .seller(CompanyEs.builder().id(product.getCompanyId()).name("").build())
                        .category(CategoryEs.builder().id(product.getCategoryId()).name("test").build())
                        .build());
    }

    public Flux<ProductEs> findAll() {
        return productEsRepository.findAll();
    }

}
