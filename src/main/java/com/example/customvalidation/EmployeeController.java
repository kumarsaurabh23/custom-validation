package com.example.customvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public Employee create(@RequestBody @Valid Employee emp) {
        return service.createEmployee(emp);
    }
}
