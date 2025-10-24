package com.example.school.services;

import com.example.school.entity.Student;
import com.example.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student insertStudent(Student std) {
        return studentRepository.save(std);
    }

    @Override
    public Student getStudent(long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> getAllStudent(Student std) {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student std) {
       Optional<Student> existing= studentRepository.findById(std.getId());
       if(existing.isPresent()){
           Student s=existing.get();
           s.setName(std.getName());
           return studentRepository.save(std);
       }
       else{
           throw new RuntimeException("Student not found with id " + std.getId());
       }
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
