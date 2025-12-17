package com.example.demo.repository;
import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;
imposrt com.example.demo.entity.student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}