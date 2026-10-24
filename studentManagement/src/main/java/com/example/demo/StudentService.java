package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentByRegno(int regno) {
        return studentRepository.findById(regno).orElse(null);
    }
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(int regno) {
        studentRepository.deleteById(regno);
    }
}