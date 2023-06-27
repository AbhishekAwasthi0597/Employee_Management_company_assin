package com.geekster.Employee.Management.System.company.assin.service;

import com.geekster.Employee.Management.System.company.assin.model.Employee;
import com.geekster.Employee.Management.System.company.assin.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public void createEmployee(Employee employee) {
        employee.setSalary(-1);
        employee.setJobRole("");
        employeeRepo.save(employee);
    }


    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public ResponseEntity<String> updateEmployee(int id, Employee employee) {
        employee.setSalary(-1);
        employee.setJobRole("");
        Employee details=employeeRepo.findById(id).get();
        if(details==null){
           return new ResponseEntity<>("id does not exist", HttpStatus.NOT_FOUND);
        }
        details.setFirstName(employee.getFirstName());
        details.setLastName(employee.getLastName());
        details.setPhoneNumber(employee.getPhoneNumber());
        details.setEmail(employee.getEmail());
        employeeRepo.save(employee);
        return new ResponseEntity<>("successfully updated", HttpStatus.OK);
    }
}
