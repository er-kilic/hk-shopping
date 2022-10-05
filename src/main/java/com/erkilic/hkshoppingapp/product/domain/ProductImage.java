package com.erkilic.hkshoppingapp.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

    private ImageType impageType;
    private String url;

    public enum ImageType{
        FEATURE, NORMAL;
    }

}
