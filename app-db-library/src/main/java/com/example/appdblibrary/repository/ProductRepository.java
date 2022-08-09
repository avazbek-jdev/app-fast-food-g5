package com.example.appdblibrary.repository;

import com.example.appdblibrary.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

      Optional<Product> findByRuNameAndIdNotAndActiveTrue(String ruName, Long id);

      Optional<Product> findByUzNameAndIdNotAndActiveTrue(String uzName, Long id);

      Optional<Product> findByRuNameAndActiveTrue(String ruName);

      Optional<Product> findByUzNameAndActiveTrue(String uzName);

}
