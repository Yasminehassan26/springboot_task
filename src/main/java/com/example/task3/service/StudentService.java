package com.example.task3.service;

import com.example.task3.entity.Student;
import com.example.task3.repositries.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer id) {
        Student student = studentRepository.findById(id).orElse(null);
        return student;
    }

}
