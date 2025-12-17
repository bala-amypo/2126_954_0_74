package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentServicem{
    StudentEntity addStudent(StudentEntity student);
    List<StudentEntity> grtAllStudents();
    studentEntity grtStudentById(Long id);
    StudentEntity u