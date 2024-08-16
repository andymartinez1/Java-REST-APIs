package com.andymartinez1.student_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentApiController {
    private static List<Student> listStudents = new ArrayList<>();
    private static Integer studentId = 0;

    static {
        listStudents.add(new Student(studentId++, "George"));
        listStudents.add(new Student(studentId++, "Johnny"));
    }

    @GetMapping
    public ResponseEntity<?> list() {
        if (listStudents.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student student) {
        student.setId(studentId++);
        listStudents.add(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> replace(@RequestBody Student student) {
        if (listStudents.contains(student)) {
            int index = listStudents.indexOf(student);
            listStudents.set(index, student);

            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        Student student = new Student(id);

        if (listStudents.contains(student)) {
            listStudents.remove(student);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
