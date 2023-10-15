package com.AngularSpringBoot.Project1.Service;

import com.AngularSpringBoot.Project1.Model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee addEmployee(Employee employee);
}
