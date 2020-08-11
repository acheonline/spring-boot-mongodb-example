package ru.achernyavskiy0n.springbootdatamongodbexample.testdata;

import ru.achernyavskiy0n.springbootdatamongodbexample.model.Employee;

/**
 * 11.08.2020
 *
 * @author a.chernyavskiy0n
 */
public class EmployeeTestData {
    public static final Employee EMPLOYEE_1 = new Employee(100000, "Employee1", "employee1pass");
    public static final Employee EMPLOYEE_2 = new Employee(100001, "Employee2", "employee2pass");
}
