package com.example.demo.sym.service;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Component;

@Component
public interface TeacherService {

	public int register(TeacherDto teacher);

	public List<?> list();

	public TeacherDto detail(String teaNum);

	public int update(TeacherDto teacher);

	public int delete(TeacherDto teacher);

}
