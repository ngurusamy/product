package com.productcatalog.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.productcatalog.products.model")
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

}
