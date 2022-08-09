package com.market.app.model.factory;

import com.market.app.model.dtos.ProductDTO;
import com.market.app.model.entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductFactory {

    private final CategoryFactory categoryFactory;

    public Product create(ProductDTO productDTO){

        return productDTO != null ?
                Product.builder()
                        .category(categoryFactory.create(productDTO.getCategoryDTO()))
                        .productName(productDTO.getProductName())
                        .productPrice(productDTO.getPrice())
                        .productStatus(productDTO.getProductStatus())
                        .productStock(productDTO.getProductStock())
                        .build() : null;

    }

    public ProductDTO create(Product product){

        return product != null ?
                ProductDTO.builder()
                        .idProduct(product.getIdProduct())
                        .categoryDTO(categoryFactory.create(product.getCategory()))
                        .productName(product.getProductName())
                        .productStatus(product.getProductStatus())
                        .productStock(product.getProductStock())
                        .price(product.getProductPrice())
                        .build() : null;
    }
}
