package com.AngularSpringBoot.Project1.Service;


import com.AngularSpringBoot.Project1.Entity.EmployeeEntity;
import com.AngularSpringBoot.Project1.Model.Employee;
import com.AngularSpringBoot.Project1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .empName(employee.getEmpName())
                .empEmailId(employee.getEmpEmailId())
                .build();
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
