package com.example.task3.controller;
import com.example.task3.entity.Student;
import com.example.task3.repositries.StudentRepository;
import com.example.task3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RequestMapping("/api/students")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/{id}")
    public Student getPatient(@PathVariable(name = "id") Integer id) {
        return studentService.getStudent(id);
    }

}
