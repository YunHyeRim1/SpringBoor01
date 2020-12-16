package com.example.demo.sym.service.impl;

import java.util.List;

import com.example.demo.cmm.mpr.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int register(TeacherDto teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public List<?> list() {
        return teacherMapper.selectAll();
    }

    @Override
    public TeacherDto detail(String teaNum) {
        return teacherMapper.selectById(teaNum);
    }

    @Override
    public int update(TeacherDto teacher) {
        return teacherMapper.update(teacher);
    }

    @Override
    public int delete(TeacherDto teacher) {
        return teacherMapper.delete(teacher);
    }
}