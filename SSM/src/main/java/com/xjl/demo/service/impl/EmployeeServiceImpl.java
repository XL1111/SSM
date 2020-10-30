package com.xjl.demo.service.impl;

import com.xjl.demo.entity.EmployeeExample;
import com.xjl.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @date 2020/10/30 11:04
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public void selectNameAndPassword(String name, String password) {
        EmployeeExample employee = new EmployeeExample();


    }
}
