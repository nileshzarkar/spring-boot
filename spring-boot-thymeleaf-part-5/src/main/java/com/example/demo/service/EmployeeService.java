package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(long id);

    void deleteEmployee(long id);
}
