package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
@Service
public class StudentService {

    private Long id = 0L;
    Map<Long, Student> studentMap = new HashMap<>();

    public Student createStudent(Student student) {
        student.setId(++id);
        studentMap.put(id, student);
        return student;
    }

    public Student getStudent(Long id) {
        return studentMap.get(id);

    }

    public Stream<Student> getAllStudent(int age) {
        Stream<Student> student = studentMap.values().stream().filter(s -> s.getAge() == age);
        return student;
    }

    public Student updateStudent(Long id, Student student) {
        studentMap.put(id, student);
        return student;
    }

    public Student deleteStudent(Long id) {
        return studentMap.remove(id);

    }

}
