package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void addsOneEmployeeSoListShouldGrow(){

        employeeRepository.save(new Employee("Benny",200));

        assertEquals(4, employeeRepository.findAll().size());

    }

    @Test
    void callingSaveShouldOverwriteCurrentEmployee(){

        var employee = employeeRepository.findAll().get(0);

        var newEmployee = employeeRepository.save(new Employee("Frege", 125));

        assertThat(employees).doesNotContain(employee).contains(newEmployee);

    }

}
