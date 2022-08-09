package com.market.app.controllers;

import com.market.app.model.dtos.ProductDTO;
import com.market.app.model.factory.ProductFactory;
import com.market.app.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private ProductFactory productFactory;

    private Map<String, Object> response;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllProducts() {
        response.put("data", productService.getAllProducts()
                .stream()
                .map(productFactory::create)
                .toList());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllbyCategory(UUID idCategory) {
        response.put("data", productService.getAllByCategoryId(idCategory)
                .stream()
                .map(productFactory::create)
                .toList());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> findById(UUID idProduct) {
        response.put("data", productFactory.create(productService.findById(idProduct)));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> saveProduct(ProductDTO productDTO){
        response.put("data", productFactory.create(productService.saveProduct(productDTO)));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Object>> deleteProduct(UUID idProduct){
        response.put("data", productService.delete(idProduct));
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
