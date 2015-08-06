package com.testapp.db;

import com.testapp.domain.Employee;

import java.util.List;

/**
 * Created by Nigel on 2015-08-03.
 */
public interface EmployeeRepository {

    Employee save(Employee employee);
    void delete(Employee employee);
    List<Employee> findAll();

}
