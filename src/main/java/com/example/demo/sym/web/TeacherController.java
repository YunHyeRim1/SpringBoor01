package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired TeacherService teacherService;

    @PostMapping("")
    public Map<?, ?> register(@RequestBody TeacherDto teacher) {
        var map = new HashMap<>();
        logger.info("등록하려는 교강사정보: " +teacher.toString());
        map.put("message", (teacherService.register(teacher) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
    @GetMapping("/{teaNum}")
    public TeacherDto profile(@PathVariable String teaNum) {
        logger.info("프로필 정보: " +teaNum);
        return teacherService.detail(teaNum);
    }
    @GetMapping("")
    public List<?> list() {
        logger.info("======= 교강사 목록 조회 =======");
        return teacherService.list();
    }
}
