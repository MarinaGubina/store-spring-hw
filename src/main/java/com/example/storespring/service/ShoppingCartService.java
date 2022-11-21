package com.example.storespring.service;

import com.example.storespring.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShoppingCartService {

    private final List<Product> basket = new ArrayList<>();

    public List<Product> add(List<Integer> id){
        List<Product> productList = new ArrayList<>();
        for (Integer i : id) {
            Product product = new Product(i);
            basket.add(product);
            productList.add(product);
        }
        return new ArrayList<>(productList);
    }

    public List<Product> getAll() {
        return new ArrayList<>(basket);
    }
}
