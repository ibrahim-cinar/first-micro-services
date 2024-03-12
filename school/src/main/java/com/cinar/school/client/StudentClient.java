package com.cinar.school.client;

import com.cinar.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "student-service", url = "${spring.application.config.students-url}")
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<Student> findAllStudentsBySchoolId(@PathVariable Integer schoolId);
}
