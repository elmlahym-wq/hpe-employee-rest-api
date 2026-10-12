package com.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    private final Employees employees = new Employees();

    public EmployeeManager() {
        Employee emp1 = new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer");
        Employee emp2 = new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Project Manager");
        Employee emp3 = new Employee("3", "Alex", "Jones", "alex.jones@example.com", "DevOps Engineer");

        employees.getEmployeeList().add(emp1);
        employees.getEmployeeList().add(emp2);
        employees.getEmployeeList().add(emp3);
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
