package com.cinar.school;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Integer studentNumber;
    private String email;
}
