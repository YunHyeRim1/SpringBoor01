package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class TeacherDto {
    private String teaNum, name, email, password, subject, profileImage;
}