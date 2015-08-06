package com.testapp.service.impl;

import com.testapp.db.EmployeeRepository;
import com.testapp.domain.Employee;
import com.testapp.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nigel on 2015-08-03.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

}
