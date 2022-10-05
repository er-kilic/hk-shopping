package com.erkilic.hkshoppingapp.product.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collation = "product_price")
@Getter
@Setter
@EqualsAndHashCode(of = "id") //2 product price in birbirine eşit olmamasını sağlayan şey
public class ProductPrice {

    private String id;
    private String productId;
    private MoneyTypes moneyType;
    private BigDecimal price;

}
