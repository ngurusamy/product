package com.productcatalog.products.model;

import jakarta.persistence.*;


@Entity
public class Product {

    @Id
    private Long id;
    private String name;
    private String asin;
    private String imageURL;
    private String manufacturer;
    private String referralURL;
    private String description;
    private String datefirstavailable;
    private String sourceURL;

    private Boolean kidsonly;
    private Integer bestsellingrank;

    
   

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getReferralURL() {
        return referralURL;
    }

    public void setReferralURL(String referralURL) {
        this.referralURL = referralURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatefirstavailable() {
        return datefirstavailable;
    }

    public void setDatefirstavailable(String datefirstavailable) {
        this.datefirstavailable = datefirstavailable;
    }

    public String getSourceURL() {
        return sourceURL;
    }

    public void setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
    }

    public Boolean getKidsonly() {
        return kidsonly;
    }

    public void setKidsonly(Boolean kidsonly) {
        this.kidsonly = kidsonly;
    }

    public Integer getBestsellingrank() {
        return bestsellingrank;
    }

    public void setBestsellingrank(Integer bestsellingrank) {
        this.bestsellingrank = bestsellingrank;
    }

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

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", asin=" + asin + ", imageURL=" + imageURL + ", manufacturer="
                + manufacturer + ", referralURL=" + referralURL + ", description=" + description
                + ", datefirstavailable=" + datefirstavailable + ", sourceURL=" + sourceURL + ", kidsonly=" + kidsonly
                + ", bestsellingrank=" + bestsellingrank + ", company=" + company + "]";
    }

    
}