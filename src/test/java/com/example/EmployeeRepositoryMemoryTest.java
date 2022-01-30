package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeRepositoryMemoryTest {

    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Frege", 10),
            new Employee("Jagge", 50),
            new Employee("Kalle", 100)));

    EmployeeRepository employeeRepository = new EmployeeRepositoryMemory(employees);


    @Test
    void findAllShouldBeEqualToThree(){

        assertEquals(3, employeeRepository.findAll().size());
    }
}
