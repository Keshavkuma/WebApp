package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CartRepo;

import com.example.demo.entity.Cart;


@Controller
@RestController
@RequestMapping(value = "/rest/Cart")
public class CartController {

    @Autowired
    CartRepo repo4;

    @GetMapping(value = "/all")
    public List<Cart> getAll() {
        return (List<Cart>) repo4.findAll();
    }

    @PostMapping(value = "/load")
    public List<Cart> persist(@RequestBody final Cart cart) {
        repo4.save(cart);
        return (List<Cart>) repo4.findAll();
    }

}
