package com.productcatalog.products.service;

import com.productcatalog.products.model.*;
import com.productcatalog.products.reposistory.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    public CompanyRepository companyRepository;

    /*
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    */
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }
}
