package ru.achernyavskiy0n.springbootdatamongodbexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.achernyavskiy0n.springbootdatamongodbexample.repository.EmployeeRepository;

import static org.junit.jupiter.api.Assertions.*;
import static ru.achernyavskiy0n.springbootdatamongodbexample.testdata.EmployeeTestData.EMPLOYEE_1;
import static ru.achernyavskiy0n.springbootdatamongodbexample.testdata.EmployeeTestData.EMPLOYEE_2;

@SpringBootTest
class SpringBootDataMongodbExampleApplicationTests {

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

	}

	@Test
	void findByNotExistingName() {

	}
}
