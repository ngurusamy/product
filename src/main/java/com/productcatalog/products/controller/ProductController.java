package com.productcatalog.products.controller;

import com.productcatalog.products.model.*;
import com.productcatalog.products.reposistory.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

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
}

