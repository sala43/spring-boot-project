package com.example.school.services;

import com.example.school.entity.Student;

import java.util.List;

public interface StudentService {
    public Student insertStudent(Student std);
    public Student getStudent(long id);
    public List<Student> getAllStudent(Student std);
    public Student updateStudent(Student std);
    public void deleteStudent(long id);
    public void deleteAllStudent();
}
