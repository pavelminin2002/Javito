package com.xlebini.Javito.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

    @GetMapping("/")
    public String products() {
        return "products";
    }
}
