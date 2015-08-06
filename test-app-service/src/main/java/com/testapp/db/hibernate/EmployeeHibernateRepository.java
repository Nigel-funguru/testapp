package com.testapp.db.hibernate;

import com.testapp.db.EmployeeRepository;
import com.testapp.domain.Employee;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Nigel on 2015-08-03.
 */
@Repository
public class EmployeeHibernateRepository implements EmployeeRepository {

    @Autowired
    SessionFactory sessionFactory;

    public Employee save(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
        return employee;
    }

    public void delete(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    public List<Employee> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
        return criteria.list();
    }

}
