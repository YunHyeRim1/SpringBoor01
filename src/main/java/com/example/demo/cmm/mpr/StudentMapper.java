package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.uss.service.model.StudentDto;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

	public int insert(StudentDto student);

	public StudentDto login(StudentDto student);

	public StudentDto selectById(String userid);

	public List<StudentDto> selectAll();

	public int update(StudentDto student);

	public int delete(StudentDto student);
    
}
