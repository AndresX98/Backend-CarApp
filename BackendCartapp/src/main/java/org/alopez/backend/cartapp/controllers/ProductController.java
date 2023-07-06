package org.alopez.backend.cartapp.controllers;

import org.alopez.backend.cartapp.moldels.entities.Product;
import org.alopez.backend.cartapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/products")
    public List<Product> list(){
        return service.findAll();
    }
}
