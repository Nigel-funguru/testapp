package com.testapp.db.hibernate;

import com.testapp.db.EmployeeRepository;
import com.testapp.domain.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nigel on 2015-08-03.
 */
@Repository
//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class EmployeeHibernateRepository implements EmployeeRepository {

    @Autowired
    SessionFactory sessionFactory;

    //@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Employee save(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
        return employee;
    }

    //@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void delete(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    public List<Employee> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Employee.class);
        return criteria.list();
    }

}
