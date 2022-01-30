package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import java.util.List;

class EmployeeManagerTest {

    EmployeeRepository employeesRepository = new EmployeeRepsitoryStub(List.of(
            new Employee("Fredrik", 10),
            new Employee("Jakob", 50),
            new Employee("Kalle", 100)));

    BankService bankService = mock(BankService.class);
    EmployeeRepository employeeRepository = mock(EmployeeRepository.class);

    EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

    @Test
    void callingPayEmployeesMethodShouldReturnAmountOfPaymetsEqualToAmountOfEmployees(){

        employeeManager.payEmployees();

        assertEquals(3, employeeManager.payEmployees());

    }

}
