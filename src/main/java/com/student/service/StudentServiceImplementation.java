package com.student.service;

import com.student.DAO.StudentDAO;
import com.student.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@org.springframework.stereotype.Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentDAO studentDAO ;
    @Override
    public List<Student> loadStudent() {
        List<Student> studentList = studentDAO.loadStudents();
        return studentList;
    }

    @Override
    public void saveStudent(Student student) {
        if(student.getGender().equals("Female"))
        {
            System.out.println("Ladies first");
        }
        studentDAO.saveStudent(student);
    }
    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
