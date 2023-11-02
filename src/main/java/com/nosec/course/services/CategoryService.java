package com.nosec.course.services;

import com.nosec.course.entities.Category;
import com.nosec.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findByID(Long id){
        return categoryRepository.findById(id).get();
    }
}
