package com.xjl.demo.controller;

import com.xjl.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @date 2020/10/30 10:38
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


 

    @RequestMapping("/login")
    public String loginDemo(@RequestParam("name") String name, @RequestParam("password") String password){

        employeeService.selectNameAndPassword(name, password);

        return "success";
    }


}
