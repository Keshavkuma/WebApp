package com.example.demo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.Student;

@Controller
@RestController
@RequestMapping(value = "/rest/Student")
public class StudentController {

    @Autowired
    StudentRepo repo;
@GetMapping(value="/Student")
	
	public String getAllStudent()
	{
		return "CommonHeader.jsp";
	}
   

    @GetMapping(value = "/all")
    public List<Student> getAll() {
        return (List<Student>) repo.findAll();
    }

    @PostMapping(value = "/load")
    public List<Student> persist(@RequestBody final Student student) {
        repo.save(student);
        return (List<Student>) repo.findAll();
    }
    
   


	    

}