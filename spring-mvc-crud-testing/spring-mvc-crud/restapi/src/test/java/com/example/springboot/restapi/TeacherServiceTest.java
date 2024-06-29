package com.example.springboot.restapi;

import com.example.springboot.thymeleaftutorial.dao.TeacherRepository;
import com.example.springboot.thymeleaftutorial.entity.Teacher;
import com.example.springboot.thymeleaftutorial.service.TeacherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TeacherServiceTest {

    @Mock
    TeacherRepository teacherRepository;

    @InjectMocks
    TeacherService teacherService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindAll() {
        // Mock the data
        List<Teacher> teachers = Arrays.asList(
                new Teacher("John", "Smith", "john@mail.com"),
                new Teacher("Sam", "Johnson", "sam@mail.com"),
                new Teacher("Fadi", "Camel", "fadi@mail.com")
        );

        // Mock behavior
        when(teacherRepository.findAllByOrderByLastNameAsc()).thenReturn(teachers);

        // Call the method under test
        List<Teacher> result = teacherService.findAll();

        // Verify with assertEquals
        assertEquals(3, result.size());
    }

    @Test
    public void testFindByIdExistingId() {

        // Mock the data
        Teacher teacher = new Teacher("John", "Smith", "john@mail.com");
        teacher.setId(1);

        // Mock the behaviour
        when(teacherRepository.findById(1)).thenReturn(Optional.of(teacher));

        //Call the method under test environment
        Teacher result = teacherService.findById(1);

        // Verify with assertEquals
        assertNotNull(result);
        assertEquals(1,result.getId());
        assertEquals("John",result.getFirstName());
        assertEquals("Smith",result.getLastName());
        assertEquals("john@mail.com",result.getEmail());
    }

    @Test
    public void testFindByIdNonExistingId() {

        // Mock the behaviour
        when(teacherRepository.findById(1)).thenReturn(Optional.empty());

        //Verify with assertEquals, Call the method under test environment
        assertThrows(RuntimeException.class, () -> teacherService.findById(1));
    }

    @Test
    public void testSave() {

        //Mock the data
        Teacher teacher = new Teacher("John", "Smith", "john@mail.com");

        //Mock the behaviour
        when(teacherRepository.save(teacher)).thenReturn(teacher);

        // Call the method under test environment
        Teacher result = teacherService.save(teacher);

        //Verify with assertEquals
        assertNotNull(result);
        assertEquals("John",result.getFirstName());
        assertEquals("Smith",result.getLastName());
        assertEquals("john@mail.com",result.getEmail());

    }

    @Test
    public void testDeleteById() {
        // No need to mock the data or the behaviour
        teacherService.deleteById(1);

        // Verify with verify
        verify(teacherRepository, times(1)).deleteById(1);
    }

}
