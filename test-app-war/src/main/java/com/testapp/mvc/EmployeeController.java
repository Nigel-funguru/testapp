package com.testapp.mvc;

import com.testapp.domain.Employee;
import com.testapp.mvc.form_object.EmployeeFormObject;
import com.testapp.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nigel on 2015-08-03.
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeManager employeeManager;

    @RequestMapping(value = "/employee/add", method = RequestMethod.GET)
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employeeFormObject", new EmployeeFormObject());

        return "employee/add";
    }

    @RequestMapping(value = "/employee/save", method = RequestMethod.POST)
    public String saveEmployee(Model model, @ModelAttribute EmployeeFormObject employeeFormObject) {
        Employee employee = mapEmployeeFormObject(employeeFormObject);
        employeeManager.save(employee);

        model.addAttribute("employees", employeeManager.findAll());

        return "employee/success";
    }

    private Employee mapEmployeeFormObject(EmployeeFormObject employeeFormObject) {
        Employee employee = new Employee(employeeFormObject.getFirstName(),
                employeeFormObject.getLastName(),
                employeeFormObject.getEmpNumber());

        return employee;
    }

}
