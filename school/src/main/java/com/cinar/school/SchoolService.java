package com.cinar.school;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
    public void save(School school){
        schoolRepository.save(school);
    }
    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }
}
