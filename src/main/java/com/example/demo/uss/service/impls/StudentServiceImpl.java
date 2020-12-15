package com.example.demo.uss.service.impls;

import java.util.List;

import com.example.demo.cmm.mpr.StudentMapper;
import com.example.demo.uss.service.StudentService;
import com.example.demo.uss.service.model.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired StudentMapper studentMapper;
    
    @Override
    public int register(StudentDto student) {
        return studentMapper.insert(student);
    }

    @Override
    public StudentDto login(StudentDto student) {
        return studentMapper.login(student);
    }

    @Override
    public StudentDto detail(String userid) {
        return studentMapper.selectById(userid);
    }

	@Override
	public List<?> list() {
		return studentMapper.selectAll();
	}
    
}
