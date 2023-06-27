package com.geekster.Employee.Management.System.company.assin.repository;

import com.geekster.Employee.Management.System.company.assin.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
