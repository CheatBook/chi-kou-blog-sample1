package sample1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sample1.model.Student;
import sample1.model.Student2;
import sample1.model.Teacher;
import sample1.model.Teacher2;

@Controller
public class StudentController {
    @GetMapping("/student/registration")
    private String registration(Student student, Teacher teacher) {
        return "/student/registration";
    }

    @PostMapping("/student/confirm")
    private String confirm(Student student, Teacher teacher) {
        return "/student/confirm";
    }

    @GetMapping("/student/registration2")
    private String registration2(Student2 student2, Teacher2 teacher2) {
        return "/student/registration2";
    }

    @PostMapping("/student/confirm2")
    private String confirm2(Student2 student2, Teacher2 teacher2) {
        return "/student/confirm2";
    }
}
