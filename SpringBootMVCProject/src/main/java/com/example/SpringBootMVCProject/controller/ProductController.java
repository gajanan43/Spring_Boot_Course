package com.example.SpringBootMVCProject.controller;

import com.example.SpringBootMVCProject.model.Product;
import com.example.SpringBootMVCProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = service.getProductById(id);

        if(product != null){
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product) {
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable int id) {
        service.deleteProductById(id);
    }

    @GetMapping("/products/search/{keyword}")
    public ResponseEntity<List<Product>> searchProducts(@PathVariable String keyword){
        List<Product> products=service.searchProducts(keyword);
        System.out.println("searchProducts"+keyword);
        return  new ResponseEntity<>(products,HttpStatus.OK);
    }
}

