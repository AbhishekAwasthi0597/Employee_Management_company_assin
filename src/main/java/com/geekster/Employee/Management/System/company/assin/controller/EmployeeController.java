package com.geekster.Employee.Management.System.company.assin.controller;

import com.geekster.Employee.Management.System.company.assin.model.Employee;
import com.geekster.Employee.Management.System.company.assin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping()
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
       employeeService.createEmployee(employee);
       return new ResponseEntity<>("successfully created", HttpStatus.CREATED);
    }
    @GetMapping()
    public List<Employee> getAllEmployee(){
       return employeeService.getAllEmployee();
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id,@RequestBody Employee employee){
     return  employeeService.updateEmployee(id,employee);
    }
}
