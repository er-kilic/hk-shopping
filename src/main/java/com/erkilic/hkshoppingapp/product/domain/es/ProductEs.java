package com.erkilic.hkshoppingapp.product.domain.es;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Data
@Builder
@EqualsAndHashCode(of = " id")
public class ProductEs {
    private String id;
    private String name;
    private String code;
    private String description;
    private CompanyEs seller;
    private String features;
    private CategoryEs category;
    private Boolean active;
}
