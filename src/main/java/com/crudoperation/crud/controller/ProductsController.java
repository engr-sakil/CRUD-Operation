package com.crudoperation.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductsController {

    @RequestMapping("addProducts")
    public String add_products(){
        return "products/index.html";
    }
}
