package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.CourseDetailsRepo;
import com.example.demo.entity.CourseDetails;

@Controller
@RestController
@RequestMapping(value = "/rest/CourseDetails")
public class CourseDetailsController {

    @Autowired
    CourseDetailsRepo repo2;

    @GetMapping(value = "/all")
    public List<CourseDetails> getAll() {
        return (List<CourseDetails>) repo2.findAll();
    }

    @PostMapping(value = "/load")
    public List<CourseDetails> persist(@RequestBody final CourseDetails courseDetails) {
        repo2.save(courseDetails);
        return (List<CourseDetails>) repo2.findAll();
    }

}
