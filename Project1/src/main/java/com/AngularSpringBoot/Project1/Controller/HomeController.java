package com.AngularSpringBoot.Project1.Controller;

import com.AngularSpringBoot.Project1.Model.Employee;
import com.AngularSpringBoot.Project1.Service.EmployeeService;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/angular")
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/home")
    public String homeMessage(){
        return "Home message";
    }

    @PostMapping(value = "/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
