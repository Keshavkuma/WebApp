package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.dao.TrainerRepo;

import com.example.demo.entity.Trainer;

@Controller
@RestController
@RequestMapping(value = "/rest/Tariner")
public class TrainerController {

    @Autowired
    TrainerRepo repo3;

    @GetMapping(value = "/all")
    public List<Trainer> getAll() {
        return (List<Trainer>) repo3.findAll();
    }

    @PostMapping(value = "/load")
    public List<Trainer> persist(@RequestBody final Trainer trainer) {
        repo3.save(trainer);
        return (List<Trainer>) repo3.findAll();
    }

}
