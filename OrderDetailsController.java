package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.OrderDetailsRepo;

import com.example.demo.entity.OrderDetails;


@Controller
@RestController
@RequestMapping(value = "/rest/OrderDetails")
public class OrderDetailsController {

    @Autowired
    OrderDetailsRepo repo5;

    @GetMapping(value = "/all")
    public List<OrderDetails> getAll() {
        return (List<OrderDetails>) repo5.findAll();
    }

    @PostMapping(value = "/load")
    public List<OrderDetails> persist(@RequestBody final OrderDetails orderDetails) {
        repo5.save(orderDetails);
        return (List<OrderDetails>) repo5.findAll();
    }

}
