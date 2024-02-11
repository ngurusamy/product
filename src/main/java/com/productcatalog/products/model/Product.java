package com.productcatalog.products.model;

import jakarta.persistence.*;


@Entity
public class Product {

    @Id
    private Long id;
    private String name;
    
   

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}