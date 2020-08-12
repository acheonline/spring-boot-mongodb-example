package ru.achernyavskiy0n.springbootdatamongodbexample.testdata;

import ru.achernyavskiy0n.springbootdatamongodbexample.model.Employee;

import java.util.List;

/**
 * 11.08.2020
 *
 * @author a.chernyavskiy0n
 */
public class EmployeeTestData {
    public static final String EMPLOYEE_NAME_1 = "Employee1";
    public static final Integer EMPLOYEE_ID_1 = 100000;
    public static final String NOT_EXIST_EMPLOYEE = "not exist employee";
    public static final String NEW_USERNAME_EMPLOYEE_1 = "updated name";
    public static final String NEW_PASSWORD_EMPLOYEE_1 = "updated password";

    public static final Employee EMPLOYEE_1 = new Employee(EMPLOYEE_ID_1, EMPLOYEE_NAME_1, "employee1pass");
    public static final Employee EMPLOYEE_2 = new Employee(100001, "Employee2", "employee2pass");

    public static final List<Employee> EMPLOYEES = List.of(EMPLOYEE_1, EMPLOYEE_2);
}
