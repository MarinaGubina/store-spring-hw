package com.example.storespring.controller;

import com.example.storespring.model.Product;
import com.example.storespring.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;


    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public List<Product> add(@RequestParam("id") List<Integer> id){
        return shoppingCartService.add(id);
    }

    @GetMapping("/get")
    public List<Product> getAll(){
        return shoppingCartService.getAll();
    }
}
