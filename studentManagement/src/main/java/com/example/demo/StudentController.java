package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Display student form
    @GetMapping("/")
    public String showForm() {
        return "student-form";
    }

    // Read form and save student
    @PostMapping("/saveStudent")
    public String saveStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // Display all students
    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student-list";
    }
    @GetMapping("/search")
    public String searchStudent(Integer regno, Model model) {

        if (regno != null) {
            Student student = studentService.getStudentByRegno(regno);
            model.addAttribute("student", student);
        }

        return "student-search";
    }
    @GetMapping("/edit")
    public String editStudent(int regno, Model model) {

        Student student = studentService.getStudentByRegno(regno);

        model.addAttribute("student", student);

        return "student-edit";
    }

    @PostMapping("/updateStudent")
    public String updateStudent(Student student) {

        studentService.updateStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/delete")
    public String deleteStudent(int regno) {

        studentService.deleteStudent(regno);

        return "redirect:/students";
    }
}