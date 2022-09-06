package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class FacultyService {

    private Long id = 0L;
    Map<Long, Faculty> facultyMap = new HashMap<>();

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++id);
        facultyMap.put(id, faculty);
        return faculty;
    }

    public Faculty getFaculty(Long id) {
       return facultyMap.get(id);

    }

    public Stream<Faculty> getAllFaculty(String color) {
        Stream<Faculty> faculty = facultyMap.values().stream().filter(s -> s.getColor() == color);
        return faculty;
    }

    public Faculty updateFaculty(Long id, Faculty faculty) {
        facultyMap.put(id, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(Long id) {
        return facultyMap.remove(id);

    }
}
