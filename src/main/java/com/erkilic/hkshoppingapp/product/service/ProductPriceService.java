package com.erkilic.hkshoppingapp.product.service;

import com.erkilic.hkshoppingapp.product.domain.MoneyTypes;
import com.erkilic.hkshoppingapp.product.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceService {

    private final ProductPriceRepository productPriceRepository;
    public BigDecimal getByMoneyType(String id, MoneyTypes usd) {
        return BigDecimal.TEN;
    }
}
