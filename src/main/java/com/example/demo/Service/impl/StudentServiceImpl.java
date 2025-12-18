package com.example.demo.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService {

    private final Map<Long, StudentEntity> store = new HashMap<>();
    private long counter = 1;

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        student.setId(counter++);
        store.put(student.getId(), student);
        return student;
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return new ArrayList<>(store.values());
    }

    @Override
    public StudentEntity getStudent(Long id) {
        return store.get(id);
    }

    @Override
    public StudentEntity updateStudent(Long id, StudentEntity student) {
        student.setId(id);
        store.put(id, student);
        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        store.remove(id);
    }
}
