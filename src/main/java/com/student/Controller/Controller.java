package com.student.Controller;
import com.student.DAO.StudentImplementation;
import com.student.api.Student;
import com.student.service.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    StudentServiceImplementation service;
    @Autowired
    StudentImplementation studentImplementation;
    @GetMapping("/showStudent")
    public String showList(Model model) {
        List<Student> studentList = service.loadStudent();
            model.addAttribute("students", studentList);
        return "student";
    }
    @GetMapping("/showStudentPage")
    public String addStudent(Model model) {
        Student studentDTO = new Student();
        model.addAttribute("student", studentDTO);
        return "add-student";
    }
    @GetMapping("/save-student")
    public String saveStudent(Student student, Model model) {
        if(student.getId()==0)
        {
            service.saveStudent(student);
        }
        else {
             service.update(student);
        }
        return "redirect:/showStudent";
    }
    @GetMapping("/thank-you")
    public String thankYou() {
        return "redirect:/showStudent";
    }
    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("userId") int id, Model model)
    {
        Student updateStudent = service.getStudent(id);
        System.out.println(updateStudent);
        model.addAttribute("student",updateStudent);
        return "add-student";
    }
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("userId") int id)
    {
        service.deleteStudent(id);
        return "redirect:/showStudent";
    }
}