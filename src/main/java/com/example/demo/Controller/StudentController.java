package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowires;
import org.springframework.web.bind.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
publicclass StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/all")
    public List<studentEntity> grtAll
}