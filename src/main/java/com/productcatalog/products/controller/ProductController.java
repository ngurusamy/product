package com.productcatalog.products.controller;

import com.productcatalog.products.model.*;
import com.productcatalog.products.reposistory.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    Logger productControllerLog = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public ProductRepository productRepository;

    /* 
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

     @GetMapping
    public List<Product> getProductsByCompany(@RequestParam Long companyId) {
        return productRepository.findAll();
    }
    */


    @GetMapping
    public List<Product> getProductsByCompany() {
        return productRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        product = productRepository.save(product);
        //productControllerLog.info("pc-{}",product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}

