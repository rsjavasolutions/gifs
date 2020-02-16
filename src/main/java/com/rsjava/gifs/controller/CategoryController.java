package com.rsjava.gifs.controller;

import com.rsjava.gifs.model.Category;
import com.rsjava.gifs.model.Gif;
import com.rsjava.gifs.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String getGifByName(ModelMap modelMap) {
        //1. wyciągnięcie gifa
        List<Category> categoryList = categoryRepository.getAllCategories();

        //2. przekazanie do view
        modelMap.put("categories", categoryList);

        //3. zwrócenie widoku
        return "categories";
    }

}
