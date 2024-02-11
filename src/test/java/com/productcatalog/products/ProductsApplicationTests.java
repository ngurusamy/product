package com.productcatalog.products;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.productcatalog.products.model.Company;
import com.productcatalog.products.model.Product;
import com.productcatalog.products.reposistory.CompanyRepository;

@SpringBootTest
class ProductsApplicationTests {

	@Autowired
    public CompanyRepository companyRepository;

	Logger productsApplicationTestslog = LoggerFactory.getLogger(ProductsApplicationTests.class);

	@Test
	void contextLoads() {
	}

    @Test
	void saveCompany(){
		Product product = new Product();
		product.setName("Product 1");
		product.setDescription("Description for Product 1");
		List<Product> productList = new ArrayList<>();
		productList.add(product);
		Company company = new Company();
		company.setName("Amazon");
		company.setProducts(productList);
		company = companyRepository.save(company);   
		productsApplicationTestslog.info("company-{}",company);   
		try{Thread.sleep(3000000); } catch(Exception e) {
			productsApplicationTestslog.info("{}", e.getMessage());
		}
		
	}

	@Test
	void retrieveCompany(){
		List<Company> companyList = companyRepository.findAll();
		
		productsApplicationTestslog.info("companyList -{}",companyList);
	}


}
