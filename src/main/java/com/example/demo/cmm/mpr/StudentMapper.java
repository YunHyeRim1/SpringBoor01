package com.example.demo.cmm.mpr;

import com.example.demo.uss.service.model.StudentDto;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

	public int insert(StudentDto student);
    
}
