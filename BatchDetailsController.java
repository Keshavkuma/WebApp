package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BatchDetailsRepo;

import com.example.demo.entity.BatchDetails;

@Controller
@RestController
@RequestMapping(value = "/rest/BatchDetails")
public class BatchDetailsController {

    @Autowired
    BatchDetailsRepo repo1;

    @GetMapping(value = "/all")
    public List<BatchDetails> getAll() {
        return (List<BatchDetails>) repo1.findAll();
    }

    @PostMapping(value = "/load")
    public List<BatchDetails> persist(@RequestBody final BatchDetails batchDetails) {
        repo1.save(batchDetails);
        return (List<BatchDetails>) repo1.findAll();
    }

}
