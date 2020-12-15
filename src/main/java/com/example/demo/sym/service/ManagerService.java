package com.example.demo.sym.service;

import com.example.demo.sym.service.model.ManagerDto;

import org.springframework.stereotype.Component;

@Component
public interface ManagerService {

    public int register(ManagerDto manager);

}