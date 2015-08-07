package com.testapp.mvc.form_object;

/**
 * Created by Nigel on 2015-08-07.
 */
public class EmployeeFormObject {

    private String firstName;
    private String lastName;
    private Long empNumber;

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
