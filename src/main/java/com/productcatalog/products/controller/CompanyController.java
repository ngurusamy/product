package com.productcatalog.products.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.productcatalog.products.model.*;
import com.productcatalog.products.reposistory.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    
    Logger companyControllerLog = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    public CompanyRepository companyRepository;

    @Autowired
    public ProductRepository productRepository;

    /*
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    */

    @GetMapping
    public List<Company> getAllCompanies() {
        List<Company> companyList = companyRepository.findAll();
       companyControllerLog.info("get - companyList -{}",companyList);
       for(Company c: companyList){
        companyControllerLog.info("get - getProducts -{}",c.getProducts());
       }
        return companyList;
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        Company savedCompany = companyRepository.save(company);        
        companyControllerLog.info("c -{}",savedCompany);
       
       List<Company> companyList = companyRepository.findAll();
       companyControllerLog.info("findall compay- {}",companyList);
       
       for(Company c: companyList){
        companyControllerLog.info("getProducts -{}",c.getProducts());
       }
       
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
    
}

