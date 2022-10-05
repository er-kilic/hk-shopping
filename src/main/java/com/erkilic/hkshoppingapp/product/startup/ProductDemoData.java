package com.erkilic.hkshoppingapp.product.startup;

import com.erkilic.hkshoppingapp.product.domain.MoneyTypes;
import com.erkilic.hkshoppingapp.product.model.ProductSaveRequest;
import com.erkilic.hkshoppingapp.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.core.List;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.stream.IntStream;

import static java.util.UUID.randomUUID;

@Component
@RequiredArgsConstructor
public class ProductDemoData {
    private final ProductService service;

    @EventListener(ApplicationReadyEvent.class)
    public void migrate() {
        Long countData = service.count().block();
        if (countData.equals(0L)) {
            IntStream.range(0,20).forEach(x-> {
                service.save(
                ProductSaveRequest.builder()
                        .sellerId(randomUUID().toString())
                        .id(randomUUID().toString())
                        .description("Product Description" + x)
                        .money(MoneyTypes.USD)
                        .categoryId(randomUUID().toString())
                        .name("Product Name " + x)
                        .features("Features")
                        .price(BigDecimal.TEN)
                        .images(List.of("xxx"))
                        .build());
            });
        }
    }

}
