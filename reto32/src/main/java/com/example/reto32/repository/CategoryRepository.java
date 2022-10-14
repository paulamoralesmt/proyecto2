package com.example.reto32.repository;

import com.example.reto32.entities.Category;
import com.example.reto32.repository.CRUDRepository.CategoryCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCRUDRepository categoryCRUDRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCRUDRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCRUDRepository.findById(id);
    }

    public Category save(Category p){
        return categoryCRUDRepository.save(p);
    }

    public void delete(Category p){
        categoryCRUDRepository.delete(p);
    }

}
