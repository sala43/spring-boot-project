package com.example.school.controller;

import com.example.school.entity.Student;
import com.example.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StundentController {
    @Autowired
    StudentService studentService;
    @PostMapping("insertStudent")
    public Student insertStudent(@RequestBody Student std){
        return studentService.insertStudent(std);
    }
    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable  long id){
        return studentService.getStudent(id);
    }
    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(Student std){
        return studentService.getAllStudent(std);
    }
    @PutMapping("updateStudent/{id}")
    public Student updateStudent(@PathVariable long id,@RequestBody Student std){
      return   studentService.updateStudent(std);
    }
    @DeleteMapping("deleteStudent/{id}")
    public void deleteStudent( @PathVariable long id){
        studentService.deleteStudent(id);
    }
}
