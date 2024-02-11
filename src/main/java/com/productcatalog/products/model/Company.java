package com.productcatalog.products.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="company")
public class Company {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="company_id")
    private Long companyid;

    public Long getCompanyid() {
        return companyid;
    }




    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }




    private String name;

    //private List<Product> products;

    /*
    public Company(Long companyid, String name, List<Product> products) {
        this.companyid = companyid;
        this.name = name;
        this.products = products;
    }
     */

    //@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "companyid")
    private List<Product> products;

    
 
    
    // Constructors, getters, setters


    public List<Product> getProducts() {
        return products;
    }




    public void setProducts(List<Product> products) {
        this.products = products;
    }




    public Company() {
    }


    

    public Company(Long companyid, String name) {
        this.companyid = companyid;
        this.name = name;
       
    }


 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Company [companyid=" + companyid + ", name=" + name + ", products=" + products + "]";
    }

}
