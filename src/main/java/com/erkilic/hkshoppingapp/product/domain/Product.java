package com.erkilic.hkshoppingapp.product.domain;

import org.springframework.data.mongodb.core.index.Indexed;

public class Product {

    private String id;
    private String productName;
    private String productCode;
    private Boolean active;

}
