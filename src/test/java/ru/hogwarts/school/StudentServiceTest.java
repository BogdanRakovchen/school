package ru.hogwarts.school;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentServiceTest {

    private StudentService studentService = new StudentService();
    private Student student1;
    private Student student2;
    private Student student3;


    @BeforeEach
    public void setUp() {
        student1 = new Student(1L, "jon", 10);
        student2 = new Student(2L, "boris", 20);
        student3 = new Student(3L, "anna", 30);
        studentService.createStudent(student1);
        studentService.createStudent(student2);
        studentService.createStudent(student3);


    }

    @Test
    public void shouldReturnDataOfStudentTypeForCreateStudentMethod() {

        Student student1 = studentService.getStudent(1L);
        Student student2 = studentService.getStudent(2L);
        Student student3 = studentService.getStudent(3L);

        Assertions.assertEquals(student1, student1);
        Assertions.assertEquals(student2, student2);
        Assertions.assertEquals(student3, student3);
    }

    @Test
    public void shouldReturnDataOfStudentTypeForGetStudentMethod() {

        Student student1 = studentService.getStudent(1L);
        Student student2 = studentService.getStudent(2L);
        Student student3 = studentService.getStudent(3L);

        Assertions.assertEquals(student1, student1);
        Assertions.assertEquals(student2, student2);
        Assertions.assertEquals(student3, student3);
    }

//    @Test
//    public void shouldReturnDataOfStudentTypeForGetAllStudentMethod() {
//
//        Map<Long, Student> studentMap = new HashMap<>(Map.of(1L, new Student(1L, "jon", 10)));
//
//        Stream<Student> studentStream = studentMap.values().stream().collect(Collectors.toMap(1L, studentService.ge));
//
//
//        studentService.getAllStudent(10);
//
//        Assertions.assertEquals(studentStream,  studentService.getAllStudent(10));
//
//    }

    @Test
    public void shouldReturnDataOfStudentTypeForUpdateStudentMethod() {

        Student student2 = studentService.updateStudent(1L, student1);
        Student student3 = studentService.updateStudent(2L, student2);
        Student student1 = studentService.updateStudent(3L, student3);

        Assertions.assertEquals(student1, student1);
        Assertions.assertEquals(student2, student2);
        Assertions.assertEquals(student3, student3);
    }

    @Test
    public void shouldReturnDataOfStudentTypeForDeleteStudentMethod() {

        Student student2 = studentService.deleteStudent(1L);
        Student student3 = studentService.deleteStudent(2L);
        Student student1 = studentService.deleteStudent(3L);

        Assertions.assertEquals(student1, student1);
        Assertions.assertEquals(student2, student2);
        Assertions.assertEquals(student3, student3);
    }
}
