package com.market.app.services.impl;

import com.market.app.model.dtos.ProductDTO;
import com.market.app.model.entities.Product;
import com.market.app.model.factory.ProductFactory;
import com.market.app.repository.IProductRepository;
import com.market.app.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ProductFactory productFactory;


    @Override
    public Product findById(UUID idProduct) {
        Optional<Product> productOptional = productRepository.findById(idProduct);
        return productOptional.orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        return productRepository.save(productFactory.create(productDTO));
    }

    @Override
    public List<Product> getAllByCategoryId(UUID idCategory) {
        Optional<List<Product>> optionalProductList = productRepository.findAllByCategory(idCategory);
        return optionalProductList.orElse(null);
    }

    @Override
    public String delete(UUID idProduct) {
        Optional<Product> productOptional = productRepository.findById(idProduct);
        if(productOptional.isPresent()){
            productRepository.delete(productOptional.get());
            return "The product " +
                    productOptional.get().getProductName() +
                    " has been removed successfully";
        }else{
            return "An error has occurred while trying to delete, please validate";
        }
    }


}
