package com.cinar.school;

import com.cinar.school.client.StudentClient;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    private final StudentClient client;
    public SchoolService(SchoolRepository schoolRepository,StudentClient client) {
        this.schoolRepository = schoolRepository;
        this.client = client;
    }


    public void save(School school){
        schoolRepository.save(school);
    }
    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("Not Found")
                                .email("Not Found")
                                .build());
        var students = client.findAllStudentsBySchoolId(schoolId);

        return FullSchoolResponse.builder().name(school.getName())
                .email(school.getEmail()).students(students).build();
    }
}
