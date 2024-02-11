package com.productcatalog.products.service;
import com.productcatalog.products.reposistory.*;
import com.productcatalog.products.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    
    @Autowired
    public ProductRepository productRepository;

    /*
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
     */

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}

