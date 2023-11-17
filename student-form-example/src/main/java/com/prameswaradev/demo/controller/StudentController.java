package com.prameswaradev.demo.controller;

import com.prameswaradev.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {
    List<Student> students = new ArrayList<>();

    @GetMapping("/")
    public String form(Model model, @RequestParam(required = false) UUID id){
        Student student = isExist(id);
        model.addAttribute("student", student != null ? student : new Student() );
        return "form";
    }

    private Student isExist(UUID id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/submit")
    public String submit(Student student){
        Student studentFound = isExist(student.getId());
        if (studentFound == null){
            student.setId(UUID.randomUUID());
            students.add(student);
        } else {
            students.remove(studentFound);
            students.add(student);
        }
        return "redirect:/students";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam UUID id){
        Student studentFound = isExist(id);
        if (studentFound != null){
            students.remove(studentFound);
        }
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students",  students);
        return "students";
    }


}
