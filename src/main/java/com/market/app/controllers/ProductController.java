package com.market.app.controllers;

import com.market.app.model.dtos.ProductDTO;
import com.market.app.model.entities.Product;
import com.market.app.model.factory.ProductFactory;
import com.market.app.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private ProductFactory productFactory;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts()
                .stream()
                .map(productFactory::create)
                .toList(), HttpStatus.OK);
    }

    @GetMapping("/category/{idCategory}")
    public ResponseEntity<List<ProductDTO>> getByCategory(@PathVariable("idCategory") UUID idCategory) {
        return new ResponseEntity<>(productService.getAllByCategoryId(idCategory)
                .stream()
                .map(productFactory::create)
                .toList(), HttpStatus.OK);
    }

    @GetMapping("/{idProduct}")
    public ResponseEntity<ProductDTO> findById(@PathVariable("idProduct") UUID idProduct) {
        return new ResponseEntity<>(productFactory.create(productService.findById(idProduct)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(productFactory.create(productService.saveProduct(productDTO)), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idProduct}")
    public ResponseEntity<String> deleteProduct(@PathVariable("idProduct") UUID idProduct){
        return new ResponseEntity<>(productService.delete(idProduct), HttpStatus.ACCEPTED);
    }
}
