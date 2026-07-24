package com.erp.collegeerp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRequest {
    private String enrollmentNumber;
    private Integer currentSemester;
    private String department;
    private String phoneNumber;
    private LocalDate dateOfBirth;
}