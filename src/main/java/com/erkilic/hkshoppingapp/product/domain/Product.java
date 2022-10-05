package com.erkilic.hkshoppingapp.product.domain;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collation = "product")
@Data
@Builder
@EqualsAndHashCode(of = "id") //2 product price in birbirine eşit olmamasını sağlayan şey
public class Product {

    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;
    private String features;
    private String categoryId;
    private List<ProductImage> productImage;
    private Boolean active;

}
