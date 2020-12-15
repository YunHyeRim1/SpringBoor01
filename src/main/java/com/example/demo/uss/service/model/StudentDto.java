package com.example.demo.uss.service.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter
public class StudentDto {
    private String stuNum, userid, password, name, ssn, regDate, subject, profileImage;
}