package com.example.reto32.controller;

import com.example.reto32.entities.Category;
import com.example.reto32.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)

    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }


}
