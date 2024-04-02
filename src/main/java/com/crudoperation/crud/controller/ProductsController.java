package com.crudoperation.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductsController {

    @RequestMapping("")
    public String products_page(){
        return "products/index.html";
    }

    @RequestMapping("addProducts")
    public String create_products_page(){
        return "products/product.html";
    }
}
