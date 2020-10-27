package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CourseCategoryRepo;

import com.example.demo.entity.CourseCategory;



@Controller
@RestController
@RequestMapping(value = "/rest/CourseCategory")
public class CourseCategoryController {

    @Autowired
    CourseCategoryRepo repo6;

    @GetMapping(value = "/all")
    public List<CourseCategory> getAll() {
        return (List<CourseCategory>) repo6.findAll();
    }

    @PostMapping(value = "/load")
    public List<CourseCategory> persist(@RequestBody final CourseCategory orderDetails) {
        repo6.save(orderDetails);
        return (List<CourseCategory>) repo6.findAll();
    }

}
