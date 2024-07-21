package com.volley.controller;
import com.volley.entities.Student;
import com.volley.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/student")
public class StudentController {




    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public void insertStudent(@RequestBody Student student) {
        studentService.createNewStudent(student);
    }


    @GetMapping("/list")
    public List<Student> findAllTeams() {
        return studentService.getAllStudents();
    }
}

