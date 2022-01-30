package com.example;

import java.util.List;

public class EmployeeRepsitoryStub implements EmployeeRepository {

    List<Employee> employees;

    public EmployeeRepsitoryStub(List<Employee> employees) {
    this.employees = employees;

    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
