package com.rsjava.gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @ResponseBody
    @GetMapping("/")
    public String sayHello() {
        return "hello ;)";
    }
}
