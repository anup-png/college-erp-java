package com.erp.collegeerp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.TimeZone;
@SpringBootApplication
@EnableJpaAuditing
public class CollegeErpApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        SpringApplication.run(CollegeErpApplication.class, args);
        System.out.println("hello you project is running");
    }

}
