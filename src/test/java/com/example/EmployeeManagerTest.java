package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import java.util.List;

class EmployeeManagerTest {

    EmployeeRepository employeeRepository = new EmployeeRepsitoryStub(List.of(
            new Employee("Fredrik", 10),
            new Employee("Jakob", 50),
            new Employee("Kalle", 100)));

    BankService bankService = mock(BankService.class);
    EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

    @Test
    void callingPayEmployeesMethodShouldReturnAmountOfPaymetsEqualToAmountOfEmployees(){

        employeeManager.payEmployees();

        assertEquals(3, employeeManager.payEmployees());

    }

    @Test
    void payEmployeesShouldReturnTrueAfterBeingCalled(){

        employeeManager.payEmployees();

        doThrow(new RuntimeException())
                .when(bankService)
                .pay(anyString(), anyDouble());
        assertTrue(employeeRepository.findAll().get(0).isPaid());


    }

}
