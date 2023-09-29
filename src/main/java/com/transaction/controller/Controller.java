package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.entity.EmployeeK;
import com.transaction.service.EmployeeKService;

@RestController
@RequestMapping("/api/employee")
public class Controller {
      
    @Autowired
    private EmployeeKService employeeService;
      
    @PostMapping("/add")
    public ResponseEntity<EmployeeK> saveEmployee(@RequestBody EmployeeK employee) throws Exception{
        EmployeeK employeeSavedToDB = this.employeeService.addEmployee(employee);
        return new ResponseEntity<EmployeeK>(employeeSavedToDB, HttpStatus.CREATED);
    }
}