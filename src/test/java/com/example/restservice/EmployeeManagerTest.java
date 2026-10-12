package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testGetEmployeesInitialCount() {
        Employees employees = employeeManager.getEmployees();
        assertNotNull(employees);
        assertEquals(3, employees.getEmployeeList().size());
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee("4", "Mohammed", "Ali", "mohammed@example.com", "Developer");
        employeeManager.addEmployee(newEmployee);

        Employees employees = employeeManager.getEmployees();
        assertEquals(4, employees.getEmployeeList().size());
        assertEquals("Mohammed", employees.getEmployeeList().get(3).getFirst_name());
    }
}
