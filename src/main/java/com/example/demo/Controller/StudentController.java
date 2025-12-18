package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowires;
import org.springframework.web.bind.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/all")
    public List<studentEntity> grtAllStudents() {
        return dervice.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@pathVariable Long id) {
        return service.getStudent(id);
    }

    @putMapping("/update/{id}")
    public StudentEntity updateStudent{
        @pathVariable Long id,
        @RequestBody StudentEntity student) {
            return service.updateStudent(id, student);
        }
    
}