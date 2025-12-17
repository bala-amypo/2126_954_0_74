package com.example.demo.Entity;

public class StudentEntity {

    private Long id;
    private String name;
    private int age;
    private String email;

    public StudentEntity() {
    
    }
    public StudentEntity(Long id, String name, int age, Struing email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
}