package com.nosec.course.services;

import com.nosec.course.entities.Product;
import com.nosec.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findByID(Long id){
        return productRepository.findById(id).get();
    }
}
