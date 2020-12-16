package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {

	public int insert(TeacherDto teacher);

	public TeacherDto selectById(String teaNum);

	public List<TeacherDto> selectAll();

	public int update(TeacherDto teacher);

	public int delete(TeacherDto teacher);
    
}
