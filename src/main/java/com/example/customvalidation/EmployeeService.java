package com.example.customvalidation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> list = new ArrayList<>();

    public Employee createEmployee(Employee emp) {
        list.add(emp);
        return emp;
    }
}
