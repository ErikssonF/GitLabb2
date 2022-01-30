package com.example.bowlingGame;

import com.example.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    Employee employee = new Employee("Frege", 50);

    @Test
    void setIdShouldUpdateCurrentId(){

        employee.setId("Jagge");

        assertEquals("Jagge", employee.getId());

    }

    @Test
    void getIdShouldReturnCurrentId(){

    assertEquals("Frege", employee.getId());

    }

    @Test
    void setSalaryShouldReplaceCurrentSalary(){

        employee.setSalary(75);

        assertEquals(75, employee.getSalary());

    }

    @Test
    void getSalaryShouldReturnSalary(){

        assertEquals(50, employee.getSalary());
    }



}
