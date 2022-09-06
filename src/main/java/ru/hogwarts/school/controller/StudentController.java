package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.stream.Stream;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
       return studentService.createStudent(student);
    }

    @GetMapping({"id"})
    public Student getStudent(Long id) {
       return studentService.getStudent(id);
    }

    @GetMapping()
    public Stream<Student> getAllStudentOfAge(int age) {
        return studentService.getAllStudent(age);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
       return studentService.updateStudent(student.getId(), student);
    }

    @DeleteMapping({"id"})
    public Student deleteStudent(Long id) {
       return studentService.deleteStudent(id);
    }






}
