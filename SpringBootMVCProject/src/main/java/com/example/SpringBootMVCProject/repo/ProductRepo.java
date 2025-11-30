package com.example.SpringBootMVCProject.repo;

import com.example.SpringBootMVCProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    List<Product> findByBrandContainingOrCategoryContainingOrNameContaining(String brand, String category,String name);
}
