package com.example.demo.Service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentServicem{
    StudentEntity addStudent(StudentEntity student);
    List<StudentEntity> getAllStudent();
    StudentEntity getStudentById(Long id);
    StudentEntity updateStudent(Long id, StudentEntity student);
}   