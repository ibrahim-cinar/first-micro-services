package com.cinar.school;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FullSchoolResponse {
    private String name;
    private String email;
    List<Student> students;
}
