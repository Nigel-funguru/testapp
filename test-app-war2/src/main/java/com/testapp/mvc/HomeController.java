package com.testapp.mvc;

import com.testapp.domain.Employee;
import com.testapp.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Nigel on 2015-08-07.
 */
@Controller
public class HomeController {

    @Autowired
    EmployeeManager employeeManager;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String showHomePage(Model model) {
        List<Employee> employees = employeeManager.findAll();
        model.addAttribute("employees", employees);

        return "home";
    }

}
