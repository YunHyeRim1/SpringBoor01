package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.service.model.StudentDto;

import org.springframework.stereotype.Component;

@Component
public interface StudentService {

	public int register(StudentDto student);

	public StudentDto login(StudentDto student);

	public StudentDto detail(String userid);

	public List<?> list();

	public int update(StudentDto student);

	public int delete(StudentDto student);
    
}
