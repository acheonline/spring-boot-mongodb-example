package ru.achernyavskiy0n.springbootdatamongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.achernyavskiy0n.springbootdatamongodbexample.model.Employee;

import java.io.Serializable;
import java.util.List;

/**
 * 11.08.2020
 *
 * @author a.chernyavskiy0n
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Serializable> {
    Employee findByUsername(String username);
}
