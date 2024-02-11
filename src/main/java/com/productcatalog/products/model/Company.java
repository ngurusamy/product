package com.productcatalog.products.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
public class Company {

    @Id
    private Long id;

    private String companyName;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Product> products;

    
    public String getCompanyName() {
      return companyName;
    }


    public void setCompanyName(String companyName) {
      this.companyName = companyName;
    }


  


    @Override
    public String toString() {
      return "Company [id=" + id + ", companyName=" + companyName + ", products=" + products + "]";
    }


    public Long getId() {
      return id;
    }


    public void setId(Long id) {
      this.id = id;
    }


 

    public List<Product> getProducts() {
      return products;
    }


    public void setProducts(List<Product> products) {
      this.products = products;
    }  
 

}