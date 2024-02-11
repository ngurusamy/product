package com.productcatalog.products.model;

import java.util.Date;

//import org.springframework.data.annotation.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="product")
public class Product {

    @Id @GeneratedValue 
    @Column(name = "product_id")
    private     Long id;

    private String name;
    private String asin;
    private String imageURL;
    private String manufacturer;
    private String referralURL;
    private String description;
    private boolean kidsonly;
    private String datefirstavailable;
    private Integer bestsellingrank;
    private String sourceURL;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
 

    public Product() {
        // Default constructor required by JPA
    }
 /*
    public Product(Long id, String name, String asin, String imageURL, String manufacturer, String referralURL, String description, boolean kidsonly, String datefirstavailable, Integer bestsellingrank, String sourceURL) {
        this.id = id;
        this.name = name;
        this.asin = asin;
        this.imageURL = imageURL;
        this.manufacturer = manufacturer;
        this.referralURL = referralURL;
        this.description = description;
        this.kidsonly = kidsonly;
        this.datefirstavailable = datefirstavailable;
        this.bestsellingrank = bestsellingrank;
        this.sourceURL = sourceURL;
    }
 */
    // Getters and setters

    public Long getId() {
        return id;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public boolean isKidsonly() {
        return kidsonly;
    }

    public void setKidsonly(boolean kidsonly) {
        this.kidsonly = kidsonly;
    }

    public String getDatefirstavailable() {
        return datefirstavailable;
    }

    public void setDatefirstavailable(String datefirstavailable) {
        this.datefirstavailable = datefirstavailable;
    }

    public Integer getBestsellingrank() {
        return bestsellingrank;
    }

    public void setBestsellingrank(Integer bestsellingrank) {
        this.bestsellingrank = bestsellingrank;
    }

    public String getSourceURL() {
        return sourceURL;
    }

    public void setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
    }

    @Override
    public boolean equals(Object o) {
  
      if (this == o)
        return true;
      if (!(o instanceof Product))
        return false;
      Product product = (Product) o;
      return Objects.equals(this.id, product.id) && Objects.equals(this.name, product.name)
          && Objects.equals(this.asin, product.asin);
    }

    @Override
    public int hashCode() {
     return Objects.hash(this.id, this.name, this.asin);
    }    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", asin='" + getAsin() + "'" +
            ", imageURL='" + getImageURL() + "'" +
            ", manufacturer='" + getManufacturer() + "'" +
            ", referralURL='" + getReferralURL() + "'" +
            ", description='" + getDescription() + "'" +
            ", kidsonly='" + isKidsonly() + "'" +
            ", datefirstavailable='" + getDatefirstavailable() + "'" +
            ", bestsellingrank='" + getBestsellingrank() + "'" +
            ", sourceURL='" + getSourceURL() + "'" +
            "}";
    }

    
}