package com.rsjava.gifs.controller;

import com.rsjava.gifs.model.Gif;
import com.rsjava.gifs.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;


    @GetMapping("/")
    public String hello(ModelMap modelMap) {
       //1. Wyciągnięcie gifów
        List<Gif> gifList = gifRepository.getGifs();
        modelMap.put("gifs",gifList);

        //2. Pokazanie do view

        //3. Zwrócenie widoku

        return "home";
    }

    @ResponseBody
    @GetMapping("/showgifsinbrowser")
    public String showGifNames() {
        return gifRepository.getGifNames();
    }

    @GetMapping("/favorites")
    public String favoritesGifs(ModelMap modelMap){
        modelMap.put("gifs",gifRepository.getFavoritesGifs());
        return "favorites";
    }
}