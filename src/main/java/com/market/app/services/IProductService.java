package com.market.app.services;

import com.market.app.model.dtos.ProductDTO;
import com.market.app.model.entities.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface IProductService {

    public Product findById(UUID idProduct);
    public List<Product> getAllProducts();

    public Product saveProduct(ProductDTO productDTO);

    public List<Product> getAllByCategoryId(UUID idCategory);

    public String delete(UUID idProduct);
}
