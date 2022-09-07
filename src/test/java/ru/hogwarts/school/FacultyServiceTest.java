package ru.hogwarts.school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

import java.util.stream.Stream;

public class FacultyServiceTest {
    private FacultyService facultyService = new FacultyService();
    private Faculty faculty1;
    private Faculty faculty2;
    private Faculty faculty3;


    @BeforeEach
    public void setUp() {
        faculty1 = new Faculty(1L, "jon", "red");
        faculty2 = new Faculty(2L, "boris", "green");
        faculty3 = new Faculty(3L, "anna", "yellow");

        facultyService.createFaculty(faculty1);
        facultyService.createFaculty(faculty2);
        facultyService.createFaculty(faculty3);


    }

    @Test
    public void shouldReturnDataOfStudentTypeForCreateStudentMethod() {

        Faculty expected1 = facultyService.getFaculty(1L);
        Faculty expected2 = facultyService.getFaculty(2L);
        Faculty expected3 = facultyService.getFaculty(3L);

        Assertions.assertEquals(expected1, faculty1);
        Assertions.assertEquals(expected2, faculty2);
        Assertions.assertEquals(expected3, faculty3);
    }

    @Test
    public void shouldReturnDataOfStudentTypeForGetStudentMethod() {

        Faculty expected1 = facultyService.getFaculty(1L);
        Faculty expected2 = facultyService.getFaculty(2L);
        Faculty expected3 = facultyService.getFaculty(3L);

        Assertions.assertEquals(expected1, faculty1);
        Assertions.assertEquals(expected2, faculty2);
        Assertions.assertEquals(expected3, faculty3);
    }

//    @Test
//    public void shouldReturnDataOfStudentTypeForGetAllStudentMethod() {
//
//
//
//        Stream<Faculty> expected1 = facultyService.getAllFaculty("red");
//        Stream<Faculty> expected2 = facultyService.getAllFaculty("green");
//        Stream<Faculty> expected3 = facultyService.getAllFaculty("yellow");
//
//        Assertions.assertEquals(expected1, faculty1);
//        Assertions.assertEquals(expected2, faculty2);
//        Assertions.assertEquals(expected3, faculty3);
//    }

    @Test
    public void shouldReturnDataOfStudentTypeForUpdateStudentMethod() {

        Faculty expected1 = facultyService.updateFaculty(1L, faculty1);
        Faculty expected2 = facultyService.updateFaculty(2L, faculty2);
        Faculty expected3 = facultyService.updateFaculty(3L, faculty3);

        Assertions.assertEquals(expected1, faculty1);
        Assertions.assertEquals(expected2, faculty2);
        Assertions.assertEquals(expected3, faculty3);
    }

    @Test
    public void shouldReturnDataOfStudentTypeForDeleteStudentMethod() {

        Faculty expected1 = facultyService.getFaculty(1L);
        Faculty expected2 = facultyService.getFaculty(2L);
        Faculty expected3 = facultyService.getFaculty(3L);

        Assertions.assertEquals(expected1, faculty1);
        Assertions.assertEquals(expected2, faculty2);
        Assertions.assertEquals(expected3, faculty3);
    }
}
