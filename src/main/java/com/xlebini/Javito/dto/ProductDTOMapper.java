package com.xlebini.Javito.dto;

import com.xlebini.Javito.models.Product;
import org.springframework.cglib.core.internal.Function;

public class ProductDTOMapper implements Function<Product, ProductDTO> {
    @Override
    public ProductDTO apply(Product key) {

        return new ProductDTO(
                key.getId(),
                key.getTitle(),
                key.getPrice(),
                key.getDescription()
        );
    }
}
