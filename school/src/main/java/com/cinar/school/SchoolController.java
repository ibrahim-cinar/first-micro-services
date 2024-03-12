package com.cinar.school;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @GetMapping
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(schoolService.findAllSchools());
    }


    @GetMapping("/with-students/{schoolId}")
    public ResponseEntity<FullSchoolResponse> findSchoolsWithStudents(@PathVariable Integer schoolId) {
   return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        schoolService.save(school);
    }
}
