package com.productcatalog.products.reposistory;

import java.util.List;
import com.productcatalog.products.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}

