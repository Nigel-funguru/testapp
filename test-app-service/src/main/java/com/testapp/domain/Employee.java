package com.testapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Nigel on 2015-08-03.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private Long empNumber;

    public Employee() {}

    public Employee(String firstName, String lastName, Long empNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNumber = empNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }
}
