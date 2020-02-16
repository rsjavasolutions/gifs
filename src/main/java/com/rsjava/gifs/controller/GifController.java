package com.rsjava.gifs.controller;

import com.rsjava.gifs.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @ResponseBody
    @GetMapping("/")
    public String sayHello() {
        return "hello ;)";
    }

    @ResponseBody
    @GetMapping("/showgifsinbrowser")
    public String showGifNames() {
        return gifRepository.getGifNames();
    }
}