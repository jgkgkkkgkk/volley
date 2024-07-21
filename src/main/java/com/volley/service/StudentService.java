package com.volley.service;


import com.volley.entities.Student;
import com.volley.exceptions.EmailAlreadyExist;
import com.volley.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();


    }

    public void createNewStudent(Student student){
        Optional<Student>dbStudent=studentRepo.findByEmail(student.getEmail());
                if(dbStudent.isPresent()){
                    throw new EmailAlreadyExist("this Email already exist!,Please create new");
                }
                studentRepo.save(student);
    }
}
