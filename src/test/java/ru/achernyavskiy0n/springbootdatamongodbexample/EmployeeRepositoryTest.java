package ru.achernyavskiy0n.springbootdatamongodbexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.achernyavskiy0n.springbootdatamongodbexample.model.Employee;
import ru.achernyavskiy0n.springbootdatamongodbexample.repository.EmployeeRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static ru.achernyavskiy0n.springbootdatamongodbexample.testdata.EmployeeTestData.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;

    @BeforeEach
    void init() {
        repository.deleteAll();
        repository.save(EMPLOYEE_1);
        repository.save(EMPLOYEE_2);
    }

    @Test
    void checkTheSizeOfRepositoryAfterFulfill() {
        assertEquals(2, repository.findAll().size());
    }

    @Test
    void findByUserName() {
        Employee getFromDbEmployee = repository.findByUsername(EMPLOYEE_NAME_1);
        assertEquals(EMPLOYEE_1, getFromDbEmployee);
        assertEquals(EMPLOYEE_NAME_1, getFromDbEmployee.getUsername());
    }

    @Test
    void findByNotExistingName() {
        Employee notExistEmployee = repository.findByUsername(NOT_EXIST_EMPLOYEE);
        assertNull(notExistEmployee);
    }
}
