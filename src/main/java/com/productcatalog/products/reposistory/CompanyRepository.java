package com.productcatalog.products.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.productcatalog.products.model.*;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
