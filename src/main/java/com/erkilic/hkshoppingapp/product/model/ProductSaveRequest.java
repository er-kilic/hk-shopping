package com.erkilic.hkshoppingapp.product.model;

import com.erkilic.hkshoppingapp.product.domain.MoneyTypes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ProductSaveRequest {
    private String id;
    private String image;
    private String name;
    private String description;
    private String features;
    private BigDecimal available;
    private BigDecimal price;
    private MoneyTypes money;
    private List<String> images;
    private String sellerId;
    private String categoryId;

}
