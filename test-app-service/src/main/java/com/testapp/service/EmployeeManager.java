package com.testapp.service;

import com.testapp.domain.Employee;

import java.util.List;

/**
 * Created by Nigel on 2015-08-03.
 */
public interface EmployeeManager {

    Employee save(Employee employee);

    void delete(Employee employee);

    List<Employee> findAll();

}
