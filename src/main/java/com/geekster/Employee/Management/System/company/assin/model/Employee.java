package com.geekster.Employee.Management.System.company.assin.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeeId;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    @Column(name="phone_number")
    @Length(min = 10,max=10,message = "enter correct mail")
    private String phoneNumber;
    @Column(name="job_Role")
    private String jobRole;
    @Column(name="salary")
    private long salary;

}
