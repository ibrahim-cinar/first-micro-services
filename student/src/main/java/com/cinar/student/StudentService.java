package com.cinar.student;

import com.cinar.student.Student;
import com.cinar.student.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void save(Student student){
        studentRepository.save(student);
    }
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
}
