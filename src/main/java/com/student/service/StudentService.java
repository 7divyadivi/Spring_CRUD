package com.student.service;

import com.student.api.Student;
import java.util.List;

public interface StudentService {
    List<Student> loadStudent();

    void saveStudent(Student student);

    Student getStudent(int id);
    void update(Student student);
    void deleteStudent(int id);
}
